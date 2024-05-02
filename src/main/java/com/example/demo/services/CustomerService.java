package com.example.demo.services;

import java.util.List;


import com.example.demo.models.Customer;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer saveCustomer(Customer customer);
    void deleteCustomerById(String userName);
    Customer getCustomerById(String userName);
    
}
