package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Person {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int age;
    private String name;
    public void setAge(int age) {
        if (age < 0 || age >= 100)
            return;
        this.age = age;
    }
    public void setName(String name) {
        if (name == null)
            return;
        this.name = name;
    }
    public void agePlus() {
        this.age++;
    }
}
