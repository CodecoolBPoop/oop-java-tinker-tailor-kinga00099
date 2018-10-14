package com.codecool.tinker;

import java.util.Scanner;

public class Main {
    static void printResults() {
        Scanner size = new Scanner(System.in);
        System.out.println("Please enter the number of elements: ");
        int n = size.nextInt();
        System.out.println("Please enter the constant: ");
        int k = size.nextInt();
        Tinker winner = new Tinker();
        System.out.println("The winner of the game n = " + n + ", k = " + k + " is " + winner.calculateWinner(n, k));
    }

    public static void main(String[] args) {
        printResults();
    }
}
