package com.codecool.tinker;

public class Main {
    static void printResults() {
        int n = 10;
        int k = 2;
        Tinker winner = new Tinker();
        System.out.println("The winner of the game n = " + n + ", k = " + k + " is " + winner.calculateWinner(n, k));
    }

    public static void main(String[] args) {
        printResults();
    }
}
