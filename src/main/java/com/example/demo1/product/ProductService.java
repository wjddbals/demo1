package com.example.demo1.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    ProductService(ProductRepository productRepository) {
        this.productRepository=productRepository;
    }


    public Product findProduct(int id){
        return productRepository.findProduct(id);
    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }
//
//    public void saveProduct(String productName){
//        productRepository.save(productName);
//    }


}
