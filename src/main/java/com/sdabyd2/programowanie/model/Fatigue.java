package com.sdabyd2.programowanie.model;

public enum Fatigue {
    YES("yes"), NO("no");

    private String title;
    Fatigue(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
