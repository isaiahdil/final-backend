package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long>{}