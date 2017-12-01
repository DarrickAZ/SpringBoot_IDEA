package com.example.webdemo.entity;

import javax.persistence.*;

/**
 * @Package com.example.webdemo.entity
 * @ClassName User
 * @Author Darrick
 * @Date 2017/11/22 10:50
 * @Description
 * @Versions 1.0
 */
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
