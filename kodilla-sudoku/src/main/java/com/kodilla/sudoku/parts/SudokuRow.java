package com.kodilla.sudoku.parts;

import java.util.ArrayList;

public class SudokuRow {
    private ArrayList<SudokuElement> row = new ArrayList<>();

    public SudokuRow() {
        makeNewRow();
    }

    public void makeNewRow() {
        for (int i = 0; i < 9; i++) {
            row.add(new SudokuElement());
        }
    }

    public SudokuElement getRowElement(int col) {
        return row.get(col);
    }

    @Override
    public String toString() {
        return row.toString();
    }
}
