package com.examples.setter.exampl02;

import java.math.BigDecimal;

public class Money {
    private BigDecimal amount;

    public Money(String amount) {
        this.amount = new BigDecimal(amount);
    }

    public void add(Money toAdd) {
        amount = amount.add(toAdd.amount);
    }

}
