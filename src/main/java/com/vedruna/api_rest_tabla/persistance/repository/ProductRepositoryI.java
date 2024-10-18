package com.vedruna.api_rest_tabla.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedruna.api_rest_tabla.persistance.model.Product;

@Repository
public interface ProductRepositoryI extends JpaRepository<Product, Long>{
    
    List<Product> findAllProducts();
    List<Product> findByProduct_name(String product_name);
    List<Product> createProductByIdAndProduct_nameAndProduct_price(Long product_id, String product_name, float product_price);
    List<Product> updateProductByProduct_id(Long product_id, Product product);
    List<Product> deleteProductByProduct_id(Long product_id);
    
}
