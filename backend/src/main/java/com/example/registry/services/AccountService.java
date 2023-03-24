package com.example.registry.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registry.entities.Account;
import com.example.registry.entities.Transfer;
import com.example.registry.repositories.AccountRepository;
import com.example.registry.repositories.TransferRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;

    @Autowired
    private TransferRepository transferRepository;

    public Account findAccountByAccountNumber(String number) {
        return repository.findAccountByAccountNumber(number);
    }

    public Account createTransferByAccountNumber(String number, Transfer transfer) {
        Account account = findAccountByAccountNumber(number);
        account.getTransfers().add(transfer);
        account.setAmount(account.getAmount() - transfer.getAmount());

        transferRepository.save(transfer);
        return repository.save(account);
    }
    
}
