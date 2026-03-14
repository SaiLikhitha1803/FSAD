package com.example.productsearch.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.productsearch.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

    List<Product> findByCategory(String category);

    List<Product> findByPriceBetween(double min,double max);

    @Query("SELECT p FROM Product p ORDER BY p.price ASC")
    List<Product> sortByPrice();

    @Query("SELECT p FROM Product p WHERE p.price > :price")
    List<Product> findExpensiveProducts(double price);
}