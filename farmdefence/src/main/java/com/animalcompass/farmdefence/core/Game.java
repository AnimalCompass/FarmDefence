package com.animalcompass.farmdefence.core;

import com.animalcompass.farmdefence.core.pigs.Pig;
import com.animalcompass.farmdefence.core.pigs.PigPen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Game: Contains all game data.
 */
public class Game {
    public Farm farm;
    public List<Animal> active_animals;
    public List<Enemy> active_enemies;
    public List<Weapon> active_weapons;

    public int wheat;

    private Game current_game = null;

    public Game(String save_location) {
        wheat = 0;
        farm = new Farm();
        active_animals = new ArrayList<Animal>();
        active_enemies = new ArrayList<Enemy>();
        active_weapons = new ArrayList<Weapon>();
        Scanner save_data = new Scanner(save_location + "/save.fds");
        String line;
        int x, y, level;
        Scanner s;
        while (save_data.hasNextLine()){
            line = save_data.nextLine();
            switch(line.charAt(0)){
                case 'W':
                    wheat = Integer.parseInt(line.substring(1, -1));
                    break;
                case 'P':
                    s = new Scanner(line.substring(1));
                    s.useDelimiter(" ");
                    x = Integer.parseInt(s.next());
                    y = Integer.parseInt(s.next());
                    List<Pig> pigs = new ArrayList<Pig>();
                    while (s.hasNext()){
                        switch(s.next().charAt(0)){
                            case 'P':
                                pigs.add(new Pig(Pig.PIGLET));
                                break;
                            case 'M':
                                pigs.add(new Pig(Pig.MOTHER));
                                break;
                            case 'F':
                                pigs.add(new Pig(Pig.FLYING));
                                break;
                            case 'W':
                                pigs.add(new Pig(Pig.WARTHOG));
                                break;
                        }
                    }
                    farm.place_plot(new PigPen(x, y, pigs));
                    break;
                case 'F':
                    s = new Scanner(line.substring(1));
                    s.useDelimiter(" ");
                    x = Integer.parseInt(s.next());
                    y = Integer.parseInt(s.next());
                    level = Integer.parseInt(s.next());
                    farm.place_plot(new WheatPlot(x, y, level));
                    break;
            }
        }
    }

}
