package com.example.spr.controllers;


import com.example.spr.models.AdvertModel;
import org.springframework.ui.Model;
import com.example.spr.repos.AdvertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/alladverts")
public class AllAdvertsController
{
    final
    AdvertRepository advertRepository;
    public AllAdvertsController(AdvertRepository advertRepository) {
        this.advertRepository = advertRepository;
    }
    @GetMapping
    public String getAdverts(Model model)
    {
        List<AdvertModel> list = new ArrayList<>();
        list = (List<AdvertModel>) advertRepository.findAll();
        model.addAttribute("allAdvertsList",list);
        return "allAdverts";
    }
}
