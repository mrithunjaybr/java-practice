package com.tutorials;

public class Account {
    private String artoin = "";
    private double bal = 0.0;
    public Account(String arto, double v) {
        this.artoin = arto;
        this.bal = v;
    }




    @Override
    public String toString() {
        return "Account{" +
                "artoin='" + artoin + '\'' +
                ", bal=" + bal +
                '}';
    }

    public void withdraw(int i) {
        this.bal -= i;
    }

    public void deposit(int i) {
        this.bal+=i;
    }

}
