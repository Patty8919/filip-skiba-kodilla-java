package com.kodilla.sudoku.parts;

import java.util.ArrayList;
import java.util.Iterator;


public class SudokuBoard {
    private ArrayList<SudokuRow> board = new ArrayList<>();
    private Sections sections = new Sections();

    public void makeNewBoard() {
        for (int i = 0; i < 9; i++) {
            this.board.add(new SudokuRow());
        }
    }

    public SudokuBoard() {
        makeNewBoard();
        initializeCoordinates();
    }

    public void printBoard() {
        for (SudokuRow r : this.board) {
            System.out.println(r);
        }
    }

    public void setElementValue(int row, int col, int value) {
        this.board.get(row).getRowElement(col).setValue(value);

    }

    public SudokuElement getElement(int row, int col) {
        return board.get(row).getRowElement(col);
    }



    public void initializeCoordinates() {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                this.board.get(row).getRowElement(column).setCoordinates(new Coordinates(row, column));
            }
        }
    }

    public ArrayList<SudokuElement> getAllElements() {
        ArrayList<SudokuElement> resultList = new ArrayList<>();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                SudokuElement sudokuElement = this.board.get(row).getRowElement(col);
                resultList.add(sudokuElement);
            }
        }
        return resultList;
    }

    public ArrayList<SudokuElement> getElementsFromSection(int row, int col) {

        ArrayList<SudokuElement> resultList = new ArrayList<>();

        int sectionNumber = this.sections.getSectionNumberByCoordinates(new Coordinates(row, col));
        ArrayList<Coordinates> list = this.sections.getCoordinatesBySection(sectionNumber);
        for (Coordinates coordinates : list) {
            SudokuElement element = getElement(coordinates.getRow(), coordinates.getColumn());
            resultList.add(element);

        }
        return resultList;
    }

    public ArrayList<SudokuElement> getElementsInColumn(int col) {
        ArrayList<SudokuElement> resultList = new ArrayList<>();
        for (SudokuRow row : board) {
            resultList.add(row.getRowElement(col));
        }
        return resultList;
    }

    public ArrayList<SudokuElement> getElementsInRow(int row) {
        ArrayList<SudokuElement> resultList = new ArrayList<>();
        for (int col = 0; col < 9; col++) {
            resultList.add(this.board.get(row).getRowElement(col));
        }
        return resultList;
    }

}
