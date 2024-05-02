package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Customer;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(String userName) {
        return customerRepository.findByUserName(userName);
    }

    @Override
    public void deleteCustomerById(String userName) {
        customerRepository.deleteById(userName);
    }


}
