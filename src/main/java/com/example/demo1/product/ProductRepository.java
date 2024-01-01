package com.example.demo1.product;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    //디비를 연결 시켜야하는데

    //디비인척인  맵을 만들거임 여기서는 자바의 맵은 (키값을 갖고 밸류를 찾을수 있는 자료구조)데이터데이스가 맵처럼 생김
    private Map<Integer,String> db=new HashMap<>();//맵은 인터페이스이다 //el디비가 없을때 사용
    private int id=1;

    public String findProduct(){
        return db.get(1);//노트북은 1번에 담겨 있어서
    }

    public void save(String productName){
        db.put(id++,productName);
    }


}
