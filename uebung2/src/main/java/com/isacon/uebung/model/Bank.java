package com.isacon.uebung.model;

public class Bank {
    public static void main(String arg[]){
        Customer c1=new Customer(123,"Smith", "Ben");
        //Account acc1=new Account(4765, 2000.00,111);
        //c1.setMyAccount(cc1);
        System.out.print("Customer"+c1.getFirstName()+c1.getLastName()+"Account Balance: " +
                ""+c1.getMyAccount().getAccBalance());
        int entering;
    }
}
