package com.animalcompass.farmdefence.core;

import java.util.List;

/**
 * Animal: Base class for all animals.
 */
public class Animal {
    public int type, health, x, y, angle;

    public void upgrade(int type){}

    public void update(List<Enemy> enemies){}

    public void specialAttack(List<Enemy> enemies){}

    public void place(int x, int y){}
}
