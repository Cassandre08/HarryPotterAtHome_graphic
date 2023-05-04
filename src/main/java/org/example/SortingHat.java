package org.example;
import java.util.List;
import java.util.Random;

import static org.example.House.houses;


public class SortingHat {
    public String house;
    public static final Random random = new Random();
    public SortingHat(){

        List<String> houses = House.getHouses();
        String selectedHouse = selectHouse(houses);
        this.house = selectedHouse;
    }
    public String getHouse() {
        return house;
    }
    public void setHouse(String house) {
        this.house = house;
    }

    public static String selectHouse(List<String> houses) {
            int index = random.nextInt(houses.size());
            return houses.get(index);

    }
}
