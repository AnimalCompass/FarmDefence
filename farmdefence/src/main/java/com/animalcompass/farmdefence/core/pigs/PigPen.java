package com.animalcompass.farmdefence.core.pigs;

import com.animalcompass.farmdefence.core.Plot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * PigPen: a plot packed with pigs.
 */
public class PigPen extends Plot{
    List<Pig> pigs;
    int x, y;

    public PigPen(int x, int y){
        super(x, y);
        pigs = new ArrayList<Pig>();
    }

    public PigPen(int x, int y, ArrayList<Pig> pigs){
        super(x, y);
        this.pigs = pigs;
    }

    public PigPen(int x, int y, Pig[] pigs){
        super(x, y);
        this.pigs = new ArrayList<Pig>();
        Collections.addAll(this.pigs, pigs);
    }
}
