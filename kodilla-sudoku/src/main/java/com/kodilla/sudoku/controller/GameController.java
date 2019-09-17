package com.kodilla.sudoku.controller;

import com.kodilla.sudoku.SudokuResolver;
import com.kodilla.sudoku.parts.SudokuBoard;
import com.kodilla.sudoku.sample.SampleBoard;
import com.kodilla.sudoku.validators.ValueValidators;

import java.util.Scanner;

public class GameController {

    private int row;
    private int col;
    private int value;
    private String data;
    private SudokuBoard sudokuBoard = new SudokuBoard();
    private SudokuResolver sudokuResolver = new SudokuResolver();
    private SampleBoard sampleBoard = new SampleBoard();
    private ValueValidators valueValidator = new ValueValidators();

    public void startGame() {
        System.out.println("Welcome to Sudoku resolver.");
        System.out.println("1 - add value, 2 - resolve board, 3 - print board, 4 - print sample board, 5 - resolve sample board, 6 - exit");
        Scanner scan = new Scanner(System.in);
        int decision = scan.nextInt();

        switch (decision) {
            case 1:
                makeBoard();
                scan.close();
                break;
            case 2:
                sudokuResolver.resolve(sudokuBoard);
                if (sudokuResolver.getResolvedBoard().getEmptyElementsCount() == 0) {
                    System.out.println("Sudoku resolved");
                    sudokuBoard = sudokuResolver.getResolvedBoard();
                    System.out.println(sudokuBoard.printBoard());
                } else {
                    System.out.println("Can not resolve sudoku board");
                }
                sudokuBoard = new SudokuBoard();
                startGame();
                break;

            case 3:
                System.out.println(this.sudokuBoard.printBoard());
                startGame();
                break;

            case 4:
                System.out.println(sampleBoard.getSampleBoard().printBoard());
                startGame();
                break;
            case 5:
                sudokuResolver.resolve(sampleBoard.getSampleBoard());
                if (sudokuResolver.getResolvedBoard().getEmptyElementsCount() == 0) {
                    System.out.println("Sudoku resolved");
                    sudokuBoard = sudokuResolver.getResolvedBoard();
                    System.out.println(sudokuBoard.printBoard());
                } else {
                    System.out.println("Can not resolve sudoku board");
                }
                sudokuBoard = new SudokuBoard();
                startGame();
                break;
            case 6:
                System.exit(1);
        }


        scan.close();
    }

    public void retrieveData() {
        char r = data.charAt(0);
        char c = data.charAt(1);
        char v = data.charAt(2);
        row = Character.getNumericValue(r);
        col = Character.getNumericValue(c);
        value = Character.getNumericValue(v);
    }

    public void makeBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put value on row and column (For example 245 will set value 5 on a row 2 and column 4)");
        data = scanner.nextLine();

        if (inputValidator(data)) {
            retrieveData();

            if(valueValidator.isValueInRow(row-1,value,sudokuBoard)) {
                System.out.println("The value "+ value +" appears in a row "+ row+ ". Change your value.");
            }
            else if(valueValidator.isValueInColumn(col-1,value,sudokuBoard)){
                System.out.println("The value "+ value +" appears in a column "+ col+ ". Change your value.");
            }
            else if(valueValidator.isValueInSection(row-1,col-1,value,sudokuBoard)){
                System.out.println("The value "+ value +" appears in a section. Change your value.");
            }
            else{
                sudokuBoard.setElementValue(row - 1, col - 1, value);
                System.out.println("Your value on row: " + row + " and column: " + col + " is: " + value);
            }

            System.out.println("Do you want to continue? Y/N");
            String decision = scanner.nextLine().toUpperCase();
            switch (decision) {
                case "Y":
                    makeBoard();
                    break;
                default:
                    startGame();
                    scanner.close();

            }
        } else {
            makeBoard();
        }
    }

    private boolean inputValidator(String data) {
        if (data.length() != 3) {
            System.out.println("Wrong format");
            return false;
        } else if (Character.getNumericValue(data.charAt(0)) < 1 || Character.getNumericValue(data.charAt(1)) < 1 || Character.getNumericValue(data.charAt(2)) < 1) {
            System.out.println("Choose number higher than 0");
            return false;
        }
        return true;
    }
}
