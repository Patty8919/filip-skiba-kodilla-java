import com.kodilla.sudoku.SudokuResolver;
import com.kodilla.sudoku.parts.SudokuBoard;


public class SudokuGame {

    public static void main(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.setElementValue(0, 0, 6);
        sudokuBoard.setElementValue(0, 1, 2);
        sudokuBoard.setElementValue(0, 2, 3);

     /*   try {
         //   SudokuBoard sudokuBoard1 = sudokuBoard.deepCopy();
            System.out.println(sudokuBoard1.getElement(0,1));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/


        //   sudokuBoard.printBoard();

      //  SudokuResolver sudokuResolver = new SudokuResolver();
       // sudokuResolver.resolve(sudokuBoard);



    }
}
