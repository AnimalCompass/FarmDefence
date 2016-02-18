package com.animalcompass.farmdefence;

import java.util.List;

/**
 * Created by john on 2/16/16.
 */
public class Animal {
    public int type, health, x, y, angle;

    public void upgrade(int type){}

    public void update(List<Enemy> enemies){}

    public void specialAttack(List<Enemy> enemies){}

    public void place(int x, int y){}
}
