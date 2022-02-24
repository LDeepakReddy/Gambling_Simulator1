package com.blz_gambling;

public class Gambling_Simulation_1 {
    public static final int DAY_STARTING_MONEY = 100;
    public static final int BET_PER_EVERYGAME = 1;
    public static final int EXIT_MARGIN = (DAY_STARTING_MONEY / 100) * 50;
    public static final int WINNING_MARGIN = DAY_STARTING_MONEY + EXIT_MARGIN;
    public static final int LOOSING_MARGIN = DAY_STARTING_MONEY - EXIT_MARGIN;

    public static void main(String[] args) {
        int totalCash = DAY_STARTING_MONEY;

        while (totalCash < WINNING_MARGIN && totalCash > LOOSING_MARGIN) {
            int game = (int) (Math.random() * 10) % 2; //to check the player is win or lost
            if (game == 1) {
                totalCash += BET_PER_EVERYGAME;
                System.out.println("won " + totalCash);
            } else {
                totalCash -= BET_PER_EVERYGAME;
                System.out.println("loss " + totalCash);
            }
        }
    }
}
