package com.patterns.creational.singleton;

public final class Singleton {
    private static Singleton instance;
    private final String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static synchronized Singleton getInstance(String value) {
        if (instance != null) {
            return instance;
        }

        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }

            return instance;
        }
    }

    public String getValue() {
        return value;
    }
}
