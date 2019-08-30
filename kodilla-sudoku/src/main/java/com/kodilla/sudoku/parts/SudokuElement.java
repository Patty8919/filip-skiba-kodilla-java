package com.kodilla.sudoku.parts;

import java.util.ArrayList;

public class SudokuElement {

    public static int EMPTY = -1;
    private int value = EMPTY;
    private Coordinates coordinates;
    private ArrayList<Integer> possibleValues = new ArrayList<>();

    public SudokuElement() {
        fillPossibleValues();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void deletePossibleValue(int value) {
       this.possibleValues.removeIf(a->a==value);
    }

    public ArrayList<Integer> getPossibleValues() {
        return this.possibleValues;
    }

    public void fillPossibleValues() {
        for (int i = 1; i < 10; i++) {
            this.possibleValues.add(i);
        }
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void printPossibleValues() {
        System.out.println(possibleValues);
    }

    @Override
    public String toString() {
        if (value == -1)
            return " |    | ";
        else
            return " | " +value+ "  | ";
    }
}
