package com.vedruna.api_rest_tabla.services;

import java.util.List;

import com.vedruna.api_rest_tabla.persistance.model.Product;


public interface ProductServiceI {

    List<Product> findAllProducts();
    List<Product> findByProduct_name(String product_name);
    List<Product> createProductByIdAndProduct_nameAndProduct_price(Long product_id, String product_name, float product_price);
    List<Product> updateProductByProduct_id(Long product_id, Product product);
    List<Product> deleteProductByProduct_id(Long product_id);
}
