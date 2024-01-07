package com.example.demo1.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class ProductController {

    @Autowired
    private ProductService productService;



   //상품조회
    @RequestMapping(value = "/products/{id}",method = RequestMethod.GET)
    public Product findProduct(@PathVariable("id") int id){

       System.out.println(id);
       return productService.findProduct(id);
    }

    //상품등록
    @RequestMapping(value = "/products",method = RequestMethod.POST)
    public void saveProduct(@RequestBody Product product){
        //localhost://8080/products?name=__ =>productName

        System.out.println("post");
        productService.saveProduct(product);
    }
//    @RequestMapping(value = "/products",method = RequestMethod.POST)
//    public void saveProduct(@RequestParam(value = "name") String productName){
//        //localhost://8080/products?name=__ =>productName
//
//        System.out.println("post");
//        productService.saveProduct(productName);
//    }

}
