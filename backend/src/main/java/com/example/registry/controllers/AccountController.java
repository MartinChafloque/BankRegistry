package com.example.registry.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registry.entities.Account;
import com.example.registry.entities.Transfer;
import com.example.registry.services.AccountService;

@RestController
@RequestMapping("/")
@CrossOrigin
public class AccountController {
    
    @Autowired
    private AccountService service;

    @GetMapping("/{number}")
    public ResponseEntity<?> getAccountByNumber(@PathVariable String number) {
        Account account = service.findAccountByAccountNumber(number);
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }

    @GetMapping("/{number}/transfers")
    public Iterable<Transfer> getTransfersByAccountNumber(@PathVariable String number) {
        Account account = service.findAccountByAccountNumber(number);
        return account.getTransfers();
    }

    @PostMapping("/{number}/transfers")
    public ResponseEntity<?> createTransferByAccountNumber(@PathVariable String number, @RequestBody Transfer transfer) {
        Account account = service.createTransferByAccountNumber(number, transfer);
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }

}
