package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(length = 200)
    public String title;
    public Integer price;
    public void setprice(int price) {
        if (price < 0 || price >= 100)
            return;
        this.price = price;
    }
    public void setTitle(String title) {
        if (title == null)
            return;
        this.title = title;
    }
}
