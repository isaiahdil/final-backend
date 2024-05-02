package com.example.demo.controllers;

import java.io.IOException;
import java.util.List;
import com.example.demo.models.Flower;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.FlowerService;

@RestController
@CrossOrigin
@RequestMapping("/flowers")
public class FlowerController {
    
    private final FlowerService flowerService;

    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> getAllFlowers() {
        return flowerService.getAllFlowers();
    }

    @GetMapping("/{id}")
    public Flower getFlowerById(@PathVariable Long id) {
        return flowerService.getFlowerById(id).orElse(null);
    }

    @PostMapping
    public Flower saveFlower(@RequestBody Flower flower) {
        return flowerService.saveFlower(flower);
    }

    @DeleteMapping("/{id}")
    public String deleteFlowerById(@PathVariable Long id) {
        flowerService.deleteFlowerById(id);
        return "Flower deleted";
    }

    @GetMapping("/image/{id}")
    public byte[] getImage(@PathVariable int id) throws IOException {
        return flowerService.getImage(id);
    }
}
