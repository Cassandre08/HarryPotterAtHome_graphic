package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class Wand {
    // attributs
    private double size;
    private double core;
    public static List<Double> wand;

    //constructeurs
    public Wand() {
        Random rand = new Random();
        size = rand.nextInt(20) + 10;
        core = rand.nextDouble() + 0.5;
        wand = new ArrayList<Double>(Arrays.asList(size, core));

    }

    //méthodes
        public List<Double> getWand(){
            return wand;
    }
    public void setWand(List<Double> wand) {
        this.wand = wand;
    }
    }
