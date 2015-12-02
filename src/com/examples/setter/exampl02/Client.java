package com.examples.setter.exampl02;

public class Client {
    public static void main(String[] args) {

        Money balance1 = new Money("10.0");
        Money balance2 = new Money("15.0");
        balance1.add(balance2);

        System.out.println(balance1);






        /*Money pocketMoney = new Money();
        pocketMoney.setAmount(15d);
        double amount = pocketMoney.getAmount();    // we know its double
        pocketMoney.setAmount(amount + 20d);*/
    }
}
