package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(schema = "flowers", name = "customers")
public class Customer {
    
    @Id
    @Column(name = "customer_user")
    private String userName;

    @Column(name = "customer_email")
    private String email;

    @Column(name = "customer_password")
    private String password;

    @Column(name = "customer_address")
    private String address;

    public Customer(String userName, String email, String password, String address) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.address = address;
    }
}
