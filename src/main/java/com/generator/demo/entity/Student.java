package com.generator.demo.entity;

import java.time.LocalDateTime;

public class Student {
    private Integer id;

    private String name;

    private Byte gender;

    private LocalDateTime createTime;

    public Student(Integer id, String name, Byte gender, LocalDateTime createTime) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.createTime = createTime;
    }

    public Student() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}