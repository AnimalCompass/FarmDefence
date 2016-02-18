package com.animalcompass.farmdefence.pigs;

import com.animalcompass.farmdefence.Animal;
import com.animalcompass.farmdefence.Enemy;

import java.util.List;

/**
 * Created by john on 2/16/16.
 */
public class Pig extends Animal {
    public static final int PIGLET = 0, FLYING = 1, MOTHER = 2, WARTHOG = 3;
    // Mother pig specific data
    int timeout;

    //Flying pig specific data
    int centerx, centery;

    // Warthog specific data
    int chargestep; // timeout

    public Pig(){
        this.type = PIGLET;
        this.health = 10;
        this.x = 0;
        this.y = 0;
        this.angle = 0;
    }

    public Pig(int type){
        this.type = type;
        this.health = 10;
        this.x = 0;
        this.y = 0;
        this.angle = 0;
    }

    @Override
    public void upgrade(int type) {
        if (this.type == PIGLET) {
            if (type == FLYING) {
                this.type = FLYING;
            } else if (type == MOTHER) {
                this.type = MOTHER;
            } else if (type == WARTHOG) {
                this.type = WARTHOG;
            }
        }
    }

    @Override
    public void place(int x, int y) {
        switch (this.type){
            case MOTHER:
            case WARTHOG:
                this.x = x;
                this.y = y;
                break;
            case FLYING:
                this.centerx = x;
                this.centery = y;
                this.x = x;
        }
    }

    @Override
    public void update(List<Enemy> enemies){
        switch (this.type){
            case MOTHER:
                this.mother_update(enemies);
                break;
            case FLYING:
                this.flying_update(enemies);
                break;
            case WARTHOG:
                this.warthog_update(enemies);
                break;
        }
    }

    @Override
    public void specialAttack(List<Enemy> enemies){

    }

    private void mother_update(List<Enemy> enemies){

    }

    private void flying_update(List<Enemy> enemies){

    }

    private void warthog_update(List<Enemy> enemies){

    }
}
