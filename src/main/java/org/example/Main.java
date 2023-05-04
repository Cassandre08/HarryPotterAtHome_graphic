package org.example;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import org.example.Wizard;
public class Main {


        public static void main (String[]args) {
            int t = 1;
            while (t != 0) {
                Wizard wizard = new Wizard();
                System.out.println("Hello " + wizard.name + " You belong to " + wizard.selectHouse() + "!");
                System.out.println("Welcome to Hogwart, you just enter in your first year !");
                System.out.println("Your wand is " + wizard.getWandDimensions().get(0) + " cm long with a " + wizard.getWandDimensions().get(1) + " core.");
                // Code for each level
                level1();
                level2();
                level3();
                level4();
                level5();
                level6();
                level7();
                if (t == 0) {
                    break;
                }
            }
        }

        // Level 1 : The Philosopher's Stone
        private static void level1 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("You are in the toilet next to the dungeon and you meet a troll.");
        System.out.println("To defeat him, you must lift objects and drop them on his head.");

        int lifeTroll = 3; // number of lives of the troll

        while (lifeTroll > 0) {
            System.out.println("The troll has " + lifeTroll + " lives.");
            System.out.println("Lift an object by typing 's', then release it by typing 'r'.");

            boolean objetLift = false; // tell if the player has lifted an object
            boolean objetDrop = false; // tell if the player has dropped the object on the troll

            while (!objetDrop) {
                String input = sc.nextLine();
                if (input.equals("s")) {
                    objetLift = true;
                } else if (input.equals("r") && objetLift) {
                    System.out.println("You released the item on the troll's head!");
                    lifeTroll -= 1; // minus 1 on troll lives
                    objetDrop = true;
                } else {
                    System.out.println("Retry");
                }
            }
        }

        System.out.println("You won ! ");
    }

        // Level 2 : The Chamber of Secrets
        private static void level2 () {
        // Code to kill the Basilik

        Scanner sc = new Scanner(System.in);

        System.out.println("You are facing the terrible basilisk.");
        int lifeBasilik = 2;

        if (Wizard.house.equals("Gryffindor")) {
            System.out.println("You can call upon the legendary sword of Godric Gryffindor to defeat the basilisk!");
            while (lifeBasilik > 0) {
                System.out.println("The Basilik is still alive");
                System.out.println("try again !");

                boolean swordLift = false; // tell if the player has lifted the sword
                boolean swordDrop = false; // tell if the player has dropped the sword

                while (!swordDrop) {
                    String input = sc.nextLine();
                    if (input.equals("s")) {
                        swordLift = true;
                    } else if (input.equals("r") && swordLift) {
                        System.out.println("Great! You've killed the Basilik");
                        lifeBasilik -= 10; // the sword killed the basilik in one shot
                        swordDrop = true;
                    } else {
                        System.out.println("Retry");
                    }
                }
            }


        } else {
            System.out.println("You must rip out one of the basilisk's fangs and use it to destroy Tom Riddle's journal.");
            while (lifeBasilik > 0) {
                System.out.println("The Basilik is stil alive!");

                boolean fangLift = false; // tell if the player has ripped the basilik's fangs
                boolean fangDrop = false; // tell if the player has dropped the fang on Tom Riddle's journal

                while (!fangDrop) {
                    String input = sc.nextLine();
                    if (input.equals("s")) {
                        fangLift = true;
                    } else if (input.equals("r") && fangLift) {
                        System.out.println("You just destroyed Tom Riddle's journal");
                        lifeBasilik -= 1; // remove 1 life from the Basilik's lives
                        fangDrop = true;
                    } else {
                        System.out.println("Retry");
                    }
                }
            }
        }
    }

        // Level 3 : The Prisoner of Azkaban
        private static void level3 () {
        // Code to learn Expecto Patronum and kill the demantors
        Scanner scanner = new Scanner(System.in);
        boolean learnSpells = false;

        System.out.println("The Dementors are on the loose. To defeat them, you must learn the Expecto Patronum spell.");
        System.out.println("Enter the spell to start learning the spell.");

        while (!learnSpells) {
            String input = scanner.nextLine();
            if (input.equals(Spell.getSpells().get(0))) {
                learnSpells = true;
                System.out.println("Congratulation ! You have learned the Expecto Patronum spell");
            } else {
                System.out.println("Retry");
            }
        }


        System.out.println("Now that you have learned the spell, you can use Expecto Patronum to defeat Dementors.");

        // Code pour to kill the dementors with the Expecto Patronum spell
        int lifeD = 1;
        while (lifeD > 0) {
            System.out.println("Dementors are still here !");

            boolean spellLift = false; // tell if the player used the spell

            while (!spellLift) {
                String input = scanner.nextLine();
                if (input.equals(Spell.getSpells().get(0))) {
                    spellLift = true;
                    lifeD = 0;
                } else {
                    System.out.println("Retry");
                }
            }
        }
    }


        // Level 4 : The Goblet of Fire
        private static void level4 () {
            int l =1;
        // Code to get close to  Portkey while avoiding Voldemort and Peter Pettigrew
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unfortunately, you won the Triwizard Tournament... and the right to die.");
        System.out.println("You are in a cemetery, where Voldemort and Peter Pettigrew are also.");
        System.out.println("Your only chance of escape is to get closer to the Portkey to lure it to you");
        String input = scanner.nextLine();
        if (input.equals(Spell.getSpells().get(2))) {
            System.out.println("You just got close to Portkey");
        } else {
            System.out.println("Voldemort got you, you loose !");
            l = 0;

        }
    }

        // Levem 5 : The Order of the Phoenix
        private static void level5 () {
        // Code to distract Dolores Ombrage with the use of fireworks
        // fireworks
        fireworks();

        // Distraction de Dolores Ombrage
        distractOmbrage();
    }

        public static void fireworks () {
        System.out.println("Preparing fireworks...");
        // Code to get the fireworks working
    }

        public static void distractOmbrage () {
        System.out.println("Dolores Ombrage is being distracted ...");
        // Code pour distract Dolores Ombrage
    }


        // Level 6 : The Half-Blood Prince
        private static void level6 () {
        Scanner scanner = new Scanner(System.in);
        // If the user is from Slytherin, they can join the ranks of the Death Eaters
        if (Wizard.house.equals("Slytherin")) {
            System.out.println("You have joined the ranks of the Death Eaters.");
        }
        //Otherwise, the user must attack the Death Eaters from the front with the Sectumsempra spell.
        else {
            System.out.println("The Death Eaters are attacking Hogwarts!");
        }
        // Code to attack deatheaters with the spell Sectumsempra
        int lifeDE = 1;
        while (lifeDE > 0) {
            System.out.println("Deatheaters are still here");

            boolean spellLift = false; // tell if the player used the spell

            while (!spellLift) {
                String input = scanner.nextLine();
                if (input.equals(Spell.getSpells().get(1))) {
                    spellLift = true;
                    lifeDE = 0;
                } else {
                    System.out.println("Retry");
                }
            }
        }
    }

        // Level 7 : The Deathly Hallows
        private static void level7 () {
        // Code to face Voldemort and Bellatrix Lestrange
        Scanner sc = new Scanner(System.in);
        boolean isReady = false;

        System.out.println("You are facing Voldemort and Bellatrix Lestrange.");
        System.out.println("Ready ? (Y/N)");
        String ready = sc.nextLine();

        if (ready.equals("Y")) {
            isReady = true;
            Fight fight = new Fight();
            fight.Player();

        } else {
            System.out.println("ERROR ");
        }
    }

    }



