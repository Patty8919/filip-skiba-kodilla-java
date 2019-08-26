package com.kodilla.sudoku;

import com.kodilla.sudoku.parts.SudokuBoard;
import com.kodilla.sudoku.parts.SudokuElement;
import com.kodilla.sudoku.validators.ValueValidators;

import java.util.ArrayList;
import java.util.Iterator;

public class SudokuResolver {

    private ValueValidators valueValidators = new ValueValidators();

    public void resolve(SudokuBoard board) {
        ArrayList<SudokuElement> elements = board.getAllElements();
        for (SudokuElement element : elements) {
            if (element.getValue() == -1) {
                int col = element.getCoordinates().getColumn();
                int row = element.getCoordinates().getRow();
                for (int possibleValue : element.getPossibleValues()) {
                    if (!valueValidators.isValueInSection(row, col, possibleValue, board) && !valueValidators.isValueInColumn(col, possibleValue, board) && !valueValidators.isValueInRow(row, possibleValue, board)) {
                        board.setElementValue(row, col, possibleValue);
                        continue;
                    } else {
                        board.getElement(row,col).deletePossibleValue(possibleValue);
                    }
                }
            }
            System.out.println(element.getPossibleValues());
            System.out.println();
            board.printBoard();
        }

    }
}
