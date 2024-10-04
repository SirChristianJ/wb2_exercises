package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args){
        Dice dice = new Dice();
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for(int i = 1; i < 101; i++) {
            int roll1 = dice.roll();
            int roll2 = dice.roll();
            dice.printRolls(i,roll1,roll2);

            switch(roll1 + roll2){
                case 2:
                    twoCounter++;
                case 4:
                    fourCounter++;
                case 6:
                    sixCounter++;
                case 7:
                    sevenCounter++;
            }
        }

        System.out.println("\nTwo Counter: " + twoCounter + "\nFour Counter: " + fourCounter + "\nSix Counter: " + sixCounter + "\nSeven Counter: " + sevenCounter);


    }
}
