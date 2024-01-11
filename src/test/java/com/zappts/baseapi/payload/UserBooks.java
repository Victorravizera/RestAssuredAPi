package com.zappts.baseapi.payload;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserBooks {
    // Getters e Setters
    private String name;
    private String job;



    public UserBooks() {

    }

    public UserBooks(String name, String job) {
        this.name = name;
        this.job = job;
    }

}
