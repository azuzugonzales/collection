package com.examples.constructor.transfer;

import com.examples.constructor.transfer.bean.Account;

public class Runner {
    public static void main(String[] args) {
        Account from = new Account(78031864L, 258.5);
        Account to = new Account(58510009L, 12.1);
        TransferAction action = new TransferAction(52.0);
        boolean complete = action.transferIntoAccount(from, to);
        if (complete) {
            System.out.println("Summ: " + action.getTransactionAmount() + "it has been successful!");
            System.out.println("On the client's account ID = " + to.getId());
            System.out.println("it adds up: " + to.getAmount());
        } else {
            System.out.println("The transaction is not executed.");
            System.out.println("On the client's account ID = " + from.getId());
            System.out.println(" insufficient funds.");
        }
    }
}
