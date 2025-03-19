package com.example.demo.controller;

import com.example.demo.Entity.Wirte11;
import com.example.demo.Repository.Wirte11Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequiredArgsConstructor
public class Wirte11Controller {
    private final Wirte11Repository wirte11Repository;
    @GetMapping("/write")
    public String wirte11(Model model) {
        List<Wirte11> wirte11List = wirte11Repository.findAll();
        model.addAttribute("items", wirte11List);
        return "list";
    }
}