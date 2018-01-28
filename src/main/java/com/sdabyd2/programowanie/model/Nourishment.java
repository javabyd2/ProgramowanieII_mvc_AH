package com.sdabyd2.programowanie.model;

public enum Nourishment {
    HUNGRY("hungry"), NOTHUNGRY("notHungry"), STARVING("starving");

    private String title;
    Nourishment(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
