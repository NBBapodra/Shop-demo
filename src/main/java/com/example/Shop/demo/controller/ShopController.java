package com.example.Shop.demo.controller;


import com.example.Shop.demo.model.Shop;
import com.example.Shop.demo.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ShopController {
    @Autowired
    private ShopService service;


    @RequestMapping(path = {"/","/search"})

    public String home(Shop shop, Model model, String keyword) {

        List<Shop> list;
        if(keyword!=null) {
            list = service.getByKeyword(keyword);
        }else {
            list = service.getAllShops();
        }
        model.addAttribute("list", list);
        return "index";
    }
}