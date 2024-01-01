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

    public String findProduct(){
        return productRepository.findProduct();
    }

    public  void saveProduct() {
        productRepository.save();
    }
}
