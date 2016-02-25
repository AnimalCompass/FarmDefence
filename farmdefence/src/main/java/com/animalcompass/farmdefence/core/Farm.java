package com.animalcompass.farmdefence.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Farm: the area where all of your plots live.
 */
public class Farm {
    List<Plot> plots;

    public Farm(){
        this.plots = new ArrayList<Plot>();
    }

    public void place_plot(Plot plot){
        this.plots.add(plot);
    }

    public void place_plot(Plot plot, int x, int y){
        plot.x = x;
        plot.y = y;
        this.plots.add(plot);
    }

    public void update(){
        for (Plot plot : this.plots) {
            plot.update();
        }
    }
}
