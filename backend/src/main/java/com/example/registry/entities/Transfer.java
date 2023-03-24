package com.example.registry.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("transfers")
public class Transfer {
    
    @Id
    private String id;
    private String accountNumberRec;
    private String currency;
    private double amount;
    private String date;
    private String accountId;

    public Transfer(String id, String accountNumberRec, String currency, double amount, String date, String accountId) {
        this.id = id;
        this.accountNumberRec = accountNumberRec;
        this.currency = currency;
        this.amount = amount;
        this.date = date;
        this.accountId = accountId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountNumberRec() {
        return accountNumberRec;
    }

    public void setAccountNumberRec(String accountNumberRec) {
        this.accountNumberRec = accountNumberRec;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
