package com.example.yunghan.domain;

public class Member {
    private Long id;
    private String name;
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
