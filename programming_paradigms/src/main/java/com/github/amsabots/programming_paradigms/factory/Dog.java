package com.github.amsabots.programming_paradigms.factory;

public class Dog implements Pet {
    private String name, type;
   private boolean isHungry;

    public Dog() {
        this.isHungry = true;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "DOG";
    }

    @Override
    public boolean isHungry() {
        return isHungry;
    }

    @Override
    public void feed() {
   isHungry = false;
    }
}
