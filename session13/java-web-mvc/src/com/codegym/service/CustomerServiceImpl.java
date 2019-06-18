package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements ICustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Join", "join@abc.vn", "Hue"));
        customers.put(2, new Customer(2, "Witch", "witch@abc.vn", "Hue"));
        customers.put(3, new Customer(3, "Ken", "ken@abc.vn", "Hue"));
        customers.put(4, new Customer(4, "Bob", "bob@abc.vn", "Hue"));
        customers.put(5, new Customer(5, "Aida", "aida@abc.vn", "Hue"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void updateCustomer(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
