package com.vedruna.api_rest_tabla.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.vedruna.api_rest_tabla.persistance.model.Product;





@RestController
@RequestMapping("/api/v1/user")
public class ProductController {

    @Autowired
    private ProductServiceI productMngmnt;
    
    @GetMapping
    public List<Product> getAllUsers() {
        return productMngmnt.findAllProducts();
    }

    @GetMapping
    public List<Product> findByProduct_name(String product_name) {
        return productMngmnt.findByProduct_name(product_name);
    }

    @GetMapping
    public List<Product> createProductByIdAndProduct_nameAndProduct_price(Long product_id, String product_name, float product_price) {
        return productMngmnt.createProductByIdAndProduct_nameAndProduct_price(product_id, product_name, product_price);
    }

    @PostMapping
    public List<Product> updateProductByProduct_id(Long product_id, Product product) {
        return productMngmnt.updateProductByProduct_id(product_id, product);
    }
    
    @DeleteMapping
    public List<Product> deleteProductByProduct_id(Long product_id) {
        return productMngmnt.deleteProductByProduct_id(product_id);
    }

}
