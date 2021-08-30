package com.github.amsabots.programming_paradigms.AdapterPattern;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class GMOrange implements Orange {
    @Override
    public String getVariety() {
        return "GMO orange";
    }

    @Override
    public void eat() {
        System.out.println("The orange has been eaten");
    }

    @Override
    public void peel() {
        System.out.println("The orange has been peel and is ready to be eat");
    }

    @Override
    public void juice() {

    }
}
