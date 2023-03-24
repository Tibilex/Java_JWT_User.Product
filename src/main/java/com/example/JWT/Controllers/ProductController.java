package com.example.JWT.Controllers;

import com.example.JWT.Models.Product;
import com.example.JWT.Repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepo;

    @PostMapping(path="/add")
    public @ResponseBody String addNewProduct (@RequestParam String name, @RequestParam double price) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        productRepo.save(product);
        return  String.format("Product %1$s is added.", name);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Product> getAllProducts() {
        return productRepo.findAll();
    }
}
