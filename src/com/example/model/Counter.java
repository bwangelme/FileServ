package com.example.model;

public class Counter {
    private static int count;
    public static int getCount() {
        count++;
        return count;
    }
}
