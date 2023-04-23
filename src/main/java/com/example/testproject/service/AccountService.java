package com.example.testproject.service;

import com.example.testproject.dto.AccountDto;
import com.example.testproject.dto.AccountMapper;
import com.example.testproject.exception.EntityNotFoundException;
import com.example.testproject.model.Account;
import com.example.testproject.enums.EAccountStatus;
import com.example.testproject.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountMapper accountMapper;
    private final AccountRepository repository;

    @Transactional(readOnly = true)
    public Page<AccountDto> getAllByStatus(EAccountStatus status, Pageable pageable) {
        List<Long> ids = repository.findAllAccountIdsByStatus(status, pageable);
        if (!ids.isEmpty()) {
            List<Account> accounts = repository.findAllByAccountIdsWithCompanies(ids);
            if (!accounts.isEmpty()) {
                accounts = repository.findAllByAccountIdsWithCustomers(ids);
                if (!accounts.isEmpty()) {
                    accounts = repository.findAllByAccountIdsWithTariffs(ids);
                    List<AccountDto> accountDtos = accounts.stream().map(accountMapper::toDto).toList();
                    return new PageImpl<>(accountDtos, pageable, accountDtos.size());
                }
            }
        }
        log.info("Empty page has been retrieved");
        return new PageImpl<>(List.of(), pageable, 0);
    }

    public Account getById(Long id) {
        return repository.findById(id).orElseThrow(() -> {
                    String msg = String.format("Account with id %d not found", id);
                    return new EntityNotFoundException(msg);
                });
    }
}
