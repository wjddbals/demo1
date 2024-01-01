package com.example.demo1.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller//이거 둘을 한꺼번에 하려면 @RestController는 데이터 던져주는것이다
@ResponseBody//
public class ProductController {
    //사용자가 (화면) 요청을 던지면 그걸 받아서
    //요처에 맞는 메서드를 실행시킨다

    //그안에서 그에 맞는 로직을 수행할수 잇도록 서비스한테 시킬거예요

    @Autowired  // 여기 프로덕트 타입으로 넣어줄 빈 있으면 넣어줘
    private ProductService productService;//아래에 빨간줄 사라진다*변수 선언해야 한다

    //상품 조회 하는 메서드
    @RequestMapping(value = "/products", method= RequestMethod.GET)//이런 url(http://localhost:8080 이 생략 되어 있다)이 날라오고 이런 목적(GET)으로 오면 아래 메서드 실행할거야
    public String findProduct() {

      //  ProductService productService =new ProductService();//서비스에게일을시키기 위해 객체 생셩 하고 서비스에가서 findProduct메서드 생성하기//이부분은 스프링 빈으로 등록되엇 자동 주입하면 필요 없게 됨
        System.out.println("GET");
        return productService.findProduct();//서비스에게 조회좀해줘*
    }
        //상품등록
        @RequestMapping(value = "/products", method = RequestMethod.POST)
                public void saveProduct(@RequestParam(value = "name") String productName){
        //localhost:8080/products?name=___ =>productName
            System.out.println("POST");
            productService.saveProduct(productName);




    }



}
