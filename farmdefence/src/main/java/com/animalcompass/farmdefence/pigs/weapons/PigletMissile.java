package com.animalcompass.farmdefence.pigs.weapons;

import com.animalcompass.farmdefence.Enemy;
import com.animalcompass.farmdefence.Vector;
import com.animalcompass.farmdefence.Weapon;

import java.util.List;
// import java.util.Vector;

/**
 * Created by john on 2/16/16.
 */
public class PigletMissile extends Weapon {
    private Vector velocity;
    private static final int MAX_VELOCITY = 10;

    public PigletMissile(int x, int y){
        this.x = x;
        this.y = y;
        this.velocity = new Vector(0, -MAX_VELOCITY);
    }

    @Override
    public void update(List<Enemy> enemies){
        Vector steering = new Vector(0, 0);

        double closest_distance = 100000;
        Enemy closest_enemy = null;
        for (Enemy enemy : enemies){
            if (distance_to(enemy) < closest_distance){
                closest_distance = distance_to(enemy);
                closest_enemy = enemy;
            }
        }
        if (closest_enemy != null){
            Vector desired_vel = new Vector(closest_enemy.x - x, closest_enemy.y - y);
            desired_vel.normalize();
            desired_vel = desired_vel.mult(this.MAX_VELOCITY);
        }
    }

    public double distance_to(Enemy enemy){
        return new Vector(enemy.x - this.x, enemy.y - this.y).length();
    }

}
