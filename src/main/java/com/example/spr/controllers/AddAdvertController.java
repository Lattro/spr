package com.example.spr.controllers;

import com.example.spr.models.AdvertModel;
import com.example.spr.repos.AdvertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/addadvert")
public class AddAdvertController
{
    @Autowired
    AdvertRepository advertRepository;
    public AddAdvertController(AdvertRepository advertRepository) {
        this.advertRepository = advertRepository;
    }
    @PostMapping
    public String postData(@RequestParam String name, @RequestParam String price,
                           @RequestParam String weight, @RequestParam String disc,
                           @RequestParam String height, @RequestParam String length,
                           @RequestParam String width)
    {
        AdvertModel advertModel = new AdvertModel();
        advertModel.setName(name);
        advertModel.setPrice(price);
        advertModel.setWeight(weight);
        advertModel.setDisc(disc);
        advertModel.setHeight(height);
        advertModel.setLength(length);
        advertModel.setWidth(width);
        advertRepository.save(advertModel);
        return "index";
    }
    @GetMapping
    public String addAdvertController()
    {return "addAdvert";}
}
