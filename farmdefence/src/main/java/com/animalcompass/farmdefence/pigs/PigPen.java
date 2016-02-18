package com.animalcompass.farmdefence.pigs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Created by john on 2/16/16.
 */
public class PigPen {
    List<Pig> pigs;
    int x, y;

    public PigPen(int x, int y){
        this.x = x;
        this.y = y;
        pigs = new ArrayList<Pig>();
    }

    public PigPen(int x, int y, ArrayList<Pig> pigs){
        this.x = x;
        this.y = y;
        this.pigs = pigs;
    }

    public PigPen(int x, int y, Pig[] pigs){
        this.x = x;
        this.y = y;
        this.pigs = new ArrayList<Pig>();
        Collections.addAll(this.pigs, pigs);
    }
}
