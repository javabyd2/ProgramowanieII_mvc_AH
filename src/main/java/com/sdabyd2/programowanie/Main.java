package com.sdabyd2.programowanie;

import com.sdabyd2.programowanie.controller.GiantController;
import com.sdabyd2.programowanie.model.Fatigue;
import com.sdabyd2.programowanie.model.GiantModel;
import com.sdabyd2.programowanie.model.Health;
import com.sdabyd2.programowanie.model.Nourishment;
import com.sdabyd2.programowanie.view.GiantView;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GiantModel giant1 = new GiantModel(
                Health.HEALTHY,
                Fatigue.NO,
                Nourishment.STARVING

        );
        GiantModel giant2 = new GiantModel(
                Health.NOThEALTHY,
                Fatigue.YES,
                Nourishment.STARVING);

        List<GiantModel> listOfGiants = new ArrayList<>();
        listOfGiants.add(giant1);
        listOfGiants.add(giant2);

        GiantView view = new GiantView();
        GiantController controller = new GiantController(
                listOfGiants,view
        );
        controller.updateView();
        controller.setHealth(Health.HEALTHY,1);
        controller.setNourishment(Nourishment.HUNGRY,1);
        controller.updateView();

    }
}
