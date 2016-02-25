package com.animalcompass.farmdefence.core;

/**
 * Vector: A class for storing velocities and stuff.
 */
public class Vector {
    public double x, y;

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

    public Vector subtract(Vector other){
        return new Vector(this.x - other.x, this.y - other.y);
    }

    public Vector add(Vector other){
        return new Vector(this.x + other.x, this.y + other.y);
    }
}
