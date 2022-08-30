package com.example.Shop.demo.services;

import com.example.Shop.demo.model.Shop;
import com.example.Shop.demo.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {
    @Autowired
    private ShopRepository repository;


    public List<Shop> getAllShops(){
        List<Shop> list =  (List<Shop>)repository.findAll();
        return list;
    }

    public List<Shop> getByKeyword(String keyword){
        return repository.findByKeyword(keyword);
    }
}