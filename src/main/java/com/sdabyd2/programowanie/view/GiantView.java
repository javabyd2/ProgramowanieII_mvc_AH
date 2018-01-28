package com.sdabyd2.programowanie.view;

import com.sdabyd2.programowanie.model.GiantModel;

import java.util.List;

public class GiantView {

    public GiantView() {
    }

    public void displayGiant(List<GiantModel> giantModel){
        System.out.println(giantModel.toString());
    }
}
