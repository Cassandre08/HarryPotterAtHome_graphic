package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Enemy {
    public static final List<String> enemies = new ArrayList<String>(Arrays.asList("Troll", "Basilic", "Dementors", "Death Eaters","Voldemort","Peter Pettigrow","Dolores Ombrage", "Bellatrix Lestranges"));
    public static List<String> getEnemies(){
        return enemies;
    }

}
