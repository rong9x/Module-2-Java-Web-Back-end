package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {

    private static Map<Integer, Customer> customerMap;

    static {
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer(1, "Hai", "HaiNguyen@gmail.com", "Hue"));
        customerMap.put(2, new Customer(2, "Dung", "DungTran@gmail.com", "Hue"));
        customerMap.put(3, new Customer(3, "Nhung", "NhungTran@gmail.com", "Hue"));
        customerMap.put(4, new Customer(4, "Truong", "TruongHo@gmail.com", "Hue"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }
}
