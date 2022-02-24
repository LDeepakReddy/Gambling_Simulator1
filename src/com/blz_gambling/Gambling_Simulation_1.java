package com.blz_gambling;

public class Gambling_Simulation_1 {
    public static final int DAY_STARTING_MONEY = 100;
    public static final int BET_PER_EVERYGAME = 1;
    public static final int EXIT_MARGIN = (DAY_STARTING_MONEY / 100) * 50;
    public static final int WINNING_MARGIN = DAY_STARTING_MONEY + EXIT_MARGIN;
    public static final int LOOSING_MARGIN = DAY_STARTING_MONEY - EXIT_MARGIN;
    public static final int MONTH_DAYS = 30;


    public static void main(String[] args) {

        int Day = 1;
        int count = 0;
        int wonCount = 0;
        int lossCount = 0;
        int sumAmount = 0;
        int totalCash = DAY_STARTING_MONEY;
        int bet = BET_PER_EVERYGAME;
        for (Day = 1; Day <= MONTH_DAYS; Day++) {
            while (totalCash < WINNING_MARGIN && totalCash > LOOSING_MARGIN) {
                int game = (int) ((Math.random() * 10) % 2);
                if (game == 1) {
                    totalCash += bet;
                    wonCount++;
                } else {
                    totalCash -= bet;
                    lossCount++;
                }
            }
            if (totalCash == WINNING_MARGIN) {
                sumAmount += 50;
                System.out.println(" Player won " + sumAmount + " on Day " + Day);
            } else {
                sumAmount -= 50;
                System.out.println(" player lost " + sumAmount + " on day " + Day);
            }
        }
        if (sumAmount > 0) {
            System.out.println("Player won by " + sumAmount);
        } else {
            System.out.println("Player loss by " + sumAmount);
        }
    }
}