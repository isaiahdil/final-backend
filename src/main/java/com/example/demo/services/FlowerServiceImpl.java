package com.example.demo.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Flower;
import com.example.demo.repositories.FlowerRepository;
import com.example.demo.services.FlowerService;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Service
public class FlowerServiceImpl implements FlowerService{

    private final FlowerRepository flowerRepository;
    private String IMAGES_FOLDER_PATH = "images/flowers/";

    
    public FlowerServiceImpl(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    @Override
    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll();
    }

    @Override
    public Optional<Flower> getFlowerById(Long id) {
        return flowerRepository.findById(id);
    }

    @Override
    public Flower saveFlower(Flower flower) {
        return flowerRepository.save(flower);
    }

    @Override
    public void deleteFlowerById(Long id) {
        flowerRepository.deleteById(id);
    }

    @Override
    public byte[] getImage(int id) throws IOException {
        String fileExtension = ".jpeg";
        Path path = Paths.get(IMAGES_FOLDER_PATH
                + id + fileExtension);
        byte[] image = Files.readAllBytes(path);
        return image;
    }
    
}
