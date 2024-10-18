package com.vedruna.api_rest_tabla.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.api_rest_tabla.persistance.model.Product;
import com.vedruna.api_rest_tabla.services.ProductServiceI;


@RestController
@RequestMapping("/api/v2/products")
public class ProductController {
    
    @Autowired
    private ProductServiceI productMngmnt;

    @GetMapping 
    public List<Product> getAllProducts() {
        return productMngmnt.findAllProducts();
    }

    @GetMapping
    public List<Product> getAllProduct_name(String product_name) {
        return productMngmnt.findByProduct_name(product_name);
    }

    @PostMapping("/insert")
    public List<Product> productsCreated(Long product_id, String product_name, float product_price) {
        return productMngmnt.createProductByIdAndProduct_nameAndProduct_price(product_id, product_name, product_price);
    }

    @PutMapping("/edit/{product_id}")
    public List<Product> getAllProductsUpdated(Long product_id, Product product) {
        return productMngmnt.updateProductByProduct_id(product_id, product);
    }

    @DeleteMapping("delete/{id}")
    public List<Product> getAllProductsDeleted(Long product_id) {
        return productMngmnt.deleteProductByProduct_id(product_id);
    }



}
