package com.carleton.comp5104.cms.service;

import com.carleton.comp5104.cms.entity.Account;
import com.carleton.comp5104.cms.entity.Faculty;
import com.carleton.comp5104.cms.enums.AccountType;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public interface AdminAccountService {
    Page<Account> getAllAccount(Integer pageNum, Integer pageSize);

    Page<Account> getAllAccountByType(String accountType, Integer pageNum, Integer pageSize);

    Page<Account> getAllAccountByName(String name, Integer pageNum, Integer pageSize);

    Page<Account> getAllAccountByTypeAndName(String accountType, String name, Integer pageNum, Integer pageSize);

    List<Faculty> getAllFaculties();

    Account getAccountById(Integer id);

    Integer addNewAccount(Account newAccount);

    Integer deleteAccountById(Integer id);

    Integer updateAccount(Account updateAccount);

    String newAccountEmailValidCheck(String newEmailAddress);
}
