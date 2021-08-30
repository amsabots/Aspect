package com.github.amsabots.programming_paradigms.BuilderPattern;

public class ContactBuilder {
    private String name, email, address;

    public ContactBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ContactBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Contact buildContact(){
        return new Contact(name, email,address);
    }
}
