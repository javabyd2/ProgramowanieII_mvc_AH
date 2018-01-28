package com.sdabyd2.programowanie.controller;

import com.sdabyd2.programowanie.model.Fatigue;
import com.sdabyd2.programowanie.model.GiantModel;
import com.sdabyd2.programowanie.model.Health;
import com.sdabyd2.programowanie.model.Nourishment;
import com.sdabyd2.programowanie.view.GiantView;

import java.util.List;

public class GiantController {
    private List<GiantModel> giantModel;
   // private GiantModel giantModel;
    private GiantView giantView;

    public GiantController(List<GiantModel> giantModel, GiantView giantView){
        this.giantModel = giantModel;
        this.giantView = giantView;
    }

    public Health getHealth(int k){
        return giantModel.get(k).getHealth();
    }
    public void setHealth(Health health,int k){
        this.giantModel.get(k).setHealth(health);
    }
    public Fatigue getFatigue(int k){
        return giantModel.get(k).getFatigue();
    }
    public void setFatigue(Fatigue fatigue, int k){
        this.giantModel.get(k).setFatigue(fatigue);
    }
    public Nourishment getNourishment(int k){
        return giantModel.get(k).getNourishment();
    }
    public void setNourishment(Nourishment nourishment, int k){
        this.giantModel.get(k).setNourishment(nourishment);
    }
    public  void updateView(){
        this.giantView.displayGiant(giantModel);
    }
}
