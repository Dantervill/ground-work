package com.example.testproject.controller;

import com.example.testproject.dto.AccountDto;
import com.example.testproject.enums.EAccountStatus;
import com.example.testproject.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/accounts")
public class AccountController {

    private final AccountService accountService;

    // фильтр по объекту Filter
    @GetMapping
    public Page<AccountDto> getAccounts(
            @RequestParam(defaultValue = "ACTIVATED") EAccountStatus status,
            @PageableDefault(size = 5) Pageable pageable) {
        Page<AccountDto> allByStatus = accountService.getAllByStatus(status, pageable);
        log.info("Controller");
        return allByStatus;
    }
}
