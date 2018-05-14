package com.example.shahryarahmed.onlinebloodbank.Entities;

/**
 * Created by Shahryar Ahmed on 4/13/2018.
 */

public class User {

    private String name;
    private String email;
    private String bloodGroup;
    private String password;


    public User(String name,String email,String bloodGroup,String password){

        this.name=name;
        this.email=email;
        this.bloodGroup=bloodGroup;
        this.password=password;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
