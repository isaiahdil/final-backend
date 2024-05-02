package com.example.demo.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(schema = "flowers", name = "flowers")
public class Flower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flower_id")
    private Long id;

    @Column(name = "flower_name")
    private String name;

    @Column(name = "flower_types")
    private String types;

    @Column(name = "flower_occasions")
    private String occasions;

    @Column(name = "flower_colors")
    private String colors;

    @Column(name = "flower_price")
    private double price;

    public Flower(String name, String types, String occasions, String colors, double price) {
        this.name = name;
        this.types = types;
        this.occasions = occasions;
        this.colors = colors;
        this.price = price;
    }

    
}
