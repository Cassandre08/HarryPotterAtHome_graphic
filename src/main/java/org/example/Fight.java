package org.example;
import java.util.Timer;
import java.util.TimerTask;
public class Fight {
        private boolean sortUse;

        public Fight() {
            this.sortUse = false;
        }

        public void Player() {
            System.out.println("You just attacked !");
            if (!this.sortUse) {
                this.sortUse = true;
                System.out.println("AVA KEDAVRA !");
                Timer timer = new Timer();
                timer.schedule(new SortTask(), 10000); // spell has just been send 10 sec later
            }
        }

        private class SortTask extends TimerTask {
            public void run() {
                System.out.println("The ennemy attacked you, you died !");
            }
        }
    }


