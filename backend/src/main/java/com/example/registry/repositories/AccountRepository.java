package com.example.registry.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.registry.entities.Account;

public interface AccountRepository extends MongoRepository<Account, String> {
    
    @Query("{accountNumber:'?0'}")
    Account findAccountByAccountNumber(String accountNumber);

}
