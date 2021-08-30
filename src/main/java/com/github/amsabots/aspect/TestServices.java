package com.github.amsabots.aspect;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TestServices {
    @Loggable
    public void logTest(String log) {
      
    }
}
