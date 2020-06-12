package com.isacon.uebung.repository;

import com.isacon.uebung.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
        Customer findByEmailAddress(String emailAddress);
}
