package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Wirte11 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(length = 200)
    public String title;
    public String date;
}