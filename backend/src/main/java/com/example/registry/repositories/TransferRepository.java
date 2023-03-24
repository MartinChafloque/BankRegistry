package com.example.registry.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.registry.entities.Transfer;

public interface TransferRepository extends MongoRepository<Transfer, String> {
    
    @Query("{accountId:'?0'}")
    List<Transfer> findAllTransfersByAccountNumber(String accountNumber);

}
