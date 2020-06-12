package com.isacon.uebung.model;

public class Account {
    //Variables
    private int id;
    private String iban;
    private double accBalance;
    private double creditLine;

    public Account(String iban, double accountBalance, double creditLine){
        this.iban=iban; //Account No
        this.accBalance=accountBalance;
    }

    //Methods

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void transfer(Account targetAccount, double amount){
        accBalance -= amount;
        targetAccount.accBalance += amount;
    }
    //public void withdraw(double b){
    //    this.accBalance=this.accBalance-b;
    //}
    //public void creditLine(double b){
    //    this.accBalance=this.accBalance+b;
    //}
}
