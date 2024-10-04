package com.pluralsight;

public class Dice {
    private int dice;

   /* public Dice(int dice){
        this.dice = dice;
    }*/

    public int roll(){
        return (int) (Math.random() * 6) + 1;
    }

    public void printRolls(int rollNum, int dice1, int dice2){
        System.out.printf(" Roll %d:  %d  -  %d  Sum: %d\n",rollNum,dice1, dice2, Math.abs(dice1+dice2));
    }


}
