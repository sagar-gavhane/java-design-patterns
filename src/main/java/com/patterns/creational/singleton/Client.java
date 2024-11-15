package com.patterns.creational.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance("demo value");
        System.out.println(instance.getValue());
    }
}
