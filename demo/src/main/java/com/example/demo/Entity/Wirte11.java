package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
public class Wirte11 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(length = 200)
    public String title;
    public String date;
}