package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(schema = "flowers", name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

   @ManyToOne
   @JoinColumn(name = "customer_user", referencedColumnName = "customer_user", nullable = false)
    private Customer customer;

    @Column(name = "total_price")
    private Double price;

    public Order(Long id, Customer customer, Double price) {
        this.id = id;
        this.customer = customer;
        this.price = price;
    }
}
