package com.animalcompass.farmdefence;

/**
 * Created by john on 2/16/16.
 */
public class Vector {
    double x, y;

    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void normalize(){
        double length = this.length();
        this.x /= length;
        this.y /= length;
    }

    public double length(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }

    public Vector mult(double m){
        return new Vector(this.x * m, this.y * m);
    }
}
