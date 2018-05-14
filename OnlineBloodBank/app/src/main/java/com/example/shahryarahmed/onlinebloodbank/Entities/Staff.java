package com.example.shahryarahmed.onlinebloodbank.Entities;

/**
 * Created by Shahryar Ahmed on 4/13/2018.
 */

public class Staff {

    private String name;
    private String bloodBankName;
    private String location;
    private String email;
    private String password;


    public Staff(String name, String bloodBankName, String location, String email, String password) {
        this.name = name;
        this.bloodBankName = bloodBankName;
        this.location = location;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
