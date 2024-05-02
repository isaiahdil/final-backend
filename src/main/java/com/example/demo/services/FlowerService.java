package com.example.demo.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.example.demo.models.Flower;

public interface FlowerService {
    List<Flower> getAllFlowers();
    Optional<Flower> getFlowerById(Long id);
    Flower saveFlower(Flower flower);
    void deleteFlowerById(Long id);
    byte[] getImage(int id) throws IOException;
}
