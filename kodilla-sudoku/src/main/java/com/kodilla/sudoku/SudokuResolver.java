package com.kodilla.sudoku;

import com.kodilla.sudoku.parts.SudokuBoard;
import com.kodilla.sudoku.parts.SudokuElement;
import com.kodilla.sudoku.validators.ValueValidators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class SudokuResolver {

    private ValueValidators valueValidators = new ValueValidators();
    private Random random = new Random();

    public void resolve(SudokuBoard board) {

        ArrayList<SudokuElement> elements = board.getAllElements();
        while(board.getEmptyElementsCount()!=0) {
            for (SudokuElement element : elements) {
                if (element.getValue() == -1) {
                    int col = element.getCoordinates().getColumn();
                    int row = element.getCoordinates().getRow();
                    int randomValue = random.nextInt(8);
                    if (element.getPossibleValues().contains(randomValue))
                        for (int i = 0; i < element.getPossibleValues().size(); i++) {
                            int currentValue = element.getPossibleValues().get(i);
                            if (!valueValidators.isValueInSection(row, col, currentValue, board) && !valueValidators.isValueInColumn(col, currentValue, board) && !valueValidators.isValueInRow(row, currentValue, board)) {
                                board.setElementValue(row, col, currentValue);
                                continue;
                            } else {
                                board.getElement(row, col).deletePossibleValue(currentValue);
                            }
                        }
                /*for (int possibleValue : element.getPossibleValues()) {
                    if (!valueValidators.isValueInSection(row, col, possibleValue, board) && !valueValidators.isValueInColumn(col, possibleValue, board) && !valueValidators.isValueInRow(row, possibleValue, board)) {
                        board.setElementValue(row, col, possibleValue);
                        continue;
                    } else {
                        board.getElement(row,col).deletePossibleValue(possibleValue);
                    }
                }*/
                }
                System.out.println(element.getPossibleValues());
                System.out.println();
                board.printBoard();
                System.out.println();
                System.out.println(board.getEmptyElementsCount());
            }
        }

    }
}
