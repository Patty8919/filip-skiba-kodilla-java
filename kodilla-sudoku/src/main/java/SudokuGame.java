import com.kodilla.sudoku.SudokuResolver;
import com.kodilla.sudoku.parts.SudokuBoard;
import com.kodilla.sudoku.validators.ValueValidators;

public class SudokuGame {

    public static void main(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard();

        sudokuBoard.setElementValue(4, 1, 1);
        sudokuBoard.setElementValue(3, 7, 3);
        sudokuBoard.setElementValue(2, 6, 4);
        sudokuBoard.setElementValue(4, 1, 5);

     //   sudokuBoard.printBoard();

        SudokuResolver sudokuResolver = new SudokuResolver();
        sudokuResolver.resolve(sudokuBoard);



    }
}
