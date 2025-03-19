package com.example.demo.controller;

import com.example.demo.Entity.Item;
import com.example.demo.Repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemsController {

    private final ItemRepository itemRepository;

    @GetMapping("/item")
    public String item(Model model) {
        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "items.html";
    }

    @PostMapping("/add")
    String writePost(@ModelAttribute Item item) {
        itemRepository.save(item);
        return "redirect:/item";
    }
}
