package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spell {
    public static final List<String> spells = new ArrayList<String>(Arrays.asList("Expecto Patronum","Sectumsempra","Accio!","Avada Kedavra"));
    public static List<String> getSpells(){
        return spells;
    }
    private class SortTask extends Spell {
        public void run() {
            System.out.println("Avada Kedavra");
        }
    }

}