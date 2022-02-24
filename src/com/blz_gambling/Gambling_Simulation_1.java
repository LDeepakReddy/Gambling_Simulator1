package com.blz_gambling;

public class Gambling_Simulation_1 {
    public static final int DAY_STARTING_MONEY = 100;
    public static final int BET_PER_EVERYGAME = 1;

    public static void main(String[] args) {
        int totalCash = DAY_STARTING_MONEY;
        System.out.println("Day starting cash is " + DAY_STARTING_MONEY);

        int game = (int) (Math.random() * 10) % 2; //to check the player is win or lost
        if (game == 1) {
            totalCash += BET_PER_EVERYGAME;
            System.out.println("player won the bet and total cash is " + totalCash);
        } else {
            totalCash -= BET_PER_EVERYGAME;
            System.out.println("Player lost the bet and total cash is " + totalCash);
        }
    }
}
