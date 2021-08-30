package com.github.amsabots.programming_paradigms.Singleton;

public class SingletonA {
    private static SingletonA instance;

    private SingletonA() {
    }

    public static SingletonA getInstance() {
        if (instance == null) {
            synchronized (SingletonA.class) {
                if (null == instance) {
                    instance = new SingletonA();
                }
            }
        }
        return instance;
    }
}
