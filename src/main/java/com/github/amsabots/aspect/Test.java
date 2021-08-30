package com.github.amsabots.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Test {
    @Autowired
   private TestServices testServices;

    @PostConstruct
    public void log(){
        testServices.logTest("Test 1");
    }
}
