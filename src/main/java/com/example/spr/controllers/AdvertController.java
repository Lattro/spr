package com.example.spr.controllers;

import com.example.spr.models.AdvertModel;
import com.example.spr.repos.AdvertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@Controller
@RequestMapping("/advertDisc" )
public class AdvertController
{
    @Autowired
    AdvertRepository advertRepository;
    public AdvertController(AdvertRepository advertRepository) {
        this.advertRepository = advertRepository;
    }

    @GetMapping
    public String getAdverts(@RequestParam(value = "id", required = false) Long id, Model model)
    {
        AdvertModel advertModel = new AdvertModel();
        advertModel = advertRepository.findById(id).get();
        model.addAttribute("adv",advertModel);
        return "advert";
    }
}
