package com.animalcompass.farmdefence.core;


import java.util.Random;

/**
 * WheatPlot: Grows wheat
 * Wheat can be used to buy animals, feed animals, and upgrade animals.
 */
public class WheatPlot extends Plot {
    int level;

    public WheatPlot(int x, int y) {
        super(x, y);
        this.level = 0;
    }

    public WheatPlot(int x, int y, int level){
        super(x, y);
        this.level = level;
    }

    @Override
    public void update(){
        if (this.level < 5 && new Random().nextInt(10) < 1){
            this.level += 1;
        }
    }
}
