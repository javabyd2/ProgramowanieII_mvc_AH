package com.sdabyd2.programowanie.model;

public enum Nourishment {
    HUNGRY("hungry"), NOTHUNGRY("notHungry"), STRAVING("straving");

    private String title;
    Nourishment(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "Nourishment{" +
                "title='" + title + '\'' +
                '}';
    }
}
