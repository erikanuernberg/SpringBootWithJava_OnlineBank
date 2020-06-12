package com.isacon.uebung.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

//POJO, representing data that can be persisted to the database
@Entity
public class Customer {

    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private Account myAccount; //Reference Attribute
    @Column(unique = true)
    private String emailAddress;
    private String password;

    //Constructor
    public Customer(int id, String firstName, String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Methods
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Account getMyAccount(){
        return myAccount;
    }
    public void setMyAccount(Account myAccount){
        this.myAccount = myAccount;
    }
}



