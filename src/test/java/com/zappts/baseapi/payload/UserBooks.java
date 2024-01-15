package com.zappts.baseapi.payload;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserBooks {
    // Getters e Setters
    private String name;
    private String job;
    private String adress;
    private String birthday;




    public UserBooks() {

    }

    public UserBooks(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String Address() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String Birthday() {
        return adress;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }



    

}
