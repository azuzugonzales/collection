package com.examples.constructor.finalvar;

public abstract class AbstractCardAction {
    private Long account;
    public AbstractCardAction() { }
    public abstract void doPayment(double amountPayment);
    public void setACcount(Long account) {
        this.account = account;
    }
}
