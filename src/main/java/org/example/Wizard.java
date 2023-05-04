package org.example;
import java.util.List;
import java.util.Scanner;
import org.example.SortingHat;

public class Wizard {
    // attributs
    public String name;
    public static String house;
    public List<Double>  wand;

    //constructeur
    public Wizard(){
        Wand wand = new Wand();
        this.wand = getWandDimensions();
        this.name = getFullName( "Enter your full name : ");
        this.house = selectHouse();
    }

    // méthodes
// récupérer nom entier
    public String getFullName(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String fullName = scanner.nextLine();
        return fullName;
    }

    public String selectHouse() {
        SortingHat sortingHat = new SortingHat();
        return sortingHat.getHouse();
    }
    public List<Double> getWandDimensions() {
        Wand wand = new Wand();
        return wand.getWand();
    }
}
