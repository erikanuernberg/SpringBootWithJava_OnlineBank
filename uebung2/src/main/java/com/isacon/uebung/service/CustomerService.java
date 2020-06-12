package com.isacon.uebung.service;

import com.isacon.uebung.model.Customer;
import com.isacon.uebung.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    //Methods
    public List<Customer> getAllCustomers(){
        return (List<Customer>) customerRepository.findAll();
    }
/*
    Customer updateCustomer(Customer customer);
    List<Customer> getAllCustomer();
    Customer getCustomerById(int customerId);
    void deleteCustomer(int id);*/

}
