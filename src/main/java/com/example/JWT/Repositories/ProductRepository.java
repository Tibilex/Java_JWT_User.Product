package com.example.JWT.Repositories;

import com.example.JWT.Models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {}
