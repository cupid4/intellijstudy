package com.leo.exe01;

/**
 * Created by ktkwon on 2019. 11. 26..
 */

public class Student {
    private Long id;
    private String email;
    private String name;

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
