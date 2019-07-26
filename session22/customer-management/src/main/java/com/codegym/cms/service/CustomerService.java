package com.codegym.cms.service;

import com.codegym.cms.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findALl();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
