package com.sdabyd2.programowanie.model;

public class GiantModel {
    private Health health;
    private Fatigue fatigue;
    private Nourishment nourishment;

    public Health getHealth(){
        return health;
    }
    public void setHealth(Health health){
        this.health = health;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public void setFatigue(Fatigue fatigue) {
        this.fatigue = fatigue;
    }

    public Nourishment getNourishment() {
        return nourishment;
    }

    public void setNourishment(Nourishment nourishment) {
        this.nourishment = nourishment;
    }
}