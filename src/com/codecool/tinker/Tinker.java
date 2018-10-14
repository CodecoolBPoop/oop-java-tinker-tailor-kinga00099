package com.codecool.tinker;

import java.util.ArrayList;
import java.util.List;

class Tinker {
    private ArrayList fillListWithNumbers(int n, int k) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>(n);
        for (int i = 1; i < n + 1; i++) {
            listOfNumbers.add(i);
        }
        return listOfNumbers;
    }

    int calculateWinner(int n, int k) {
        ArrayList numbers = fillListWithNumbers(n, k);
        int elemToRemove = 0;
        while (numbers.size() != 1) {
            elemToRemove = (elemToRemove + k - 1) % numbers.size();
            numbers.remove(elemToRemove);
        }
        return (int) numbers.get(0);
    }
}
