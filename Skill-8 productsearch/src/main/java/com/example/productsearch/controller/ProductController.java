package com.example.productsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.productsearch.entity.Product;
import com.example.productsearch.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository repo;

    //category search
    @GetMapping("/category/{category}")
    public List<Product> getByCategory(@PathVariable String category){
        return repo.findByCategory(category);
    }

    //price filter
    @GetMapping("/filter")
    public List<Product> filter(@RequestParam double min,@RequestParam double max){
        return repo.findByPriceBetween(min,max);
    }

    //sorted products
    @GetMapping("/sorted")
    public List<Product> sorted(){
        return repo.sortByPrice();
    }

    //expensive products
    @GetMapping("/expensive/{price}")
    public List<Product> expensive(@PathVariable double price){
        return repo.findExpensiveProducts(price);
    }
}