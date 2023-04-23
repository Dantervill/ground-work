package com.example.testproject.dto;

import com.example.testproject.enums.EAccountStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {

    private EAccountStatus status;

    private List<CustomerDto> customers;

    private List<CompanyDto> companies;

    private List<AccountTariffDto> tariffs;
}
