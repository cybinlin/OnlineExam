package com.onlineexam.backend.entity;

import org.springframework.stereotype.Component;

@Component
public class Manager {
    Integer managerId;
    String name;
    String password;

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
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
