package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class House {
    public static final List<String> houses = new ArrayList<String>(Arrays.asList("Gryffindor", "Ravenclaw", "Slytherin", "Hufflepuff"));
    public static List<String> getHouses(){
        return houses;
    }

}
