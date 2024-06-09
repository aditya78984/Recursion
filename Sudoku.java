public class Sudoku {
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit){
        for (int i = 0; i <=8; i++) {
            if(sudoku[i][col] == digit){
                return false ;
            }
        }
        for (int i = 0; i <=8; i++) {
            if(sudoku[row][i] == digit){
                return false ;
            }
        }
        int sRow = (row/3)*3 ;
        int sCol = (col/3)*3 ;
        for (int i = sRow; i < sRow+3; i++) {
            for (int j = sCol; j < sCol+3; j++) {
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        
        return true;
    }
    public static boolean sudokuSolver(int[][] sudoku, int row, int col){
        //base case
        
        if(row == 9){
            return true;
        }
        int nextRow = row;
        int nextCol = col+1;
        if(nextCol == 9){
            nextRow = row + 1 ;
            nextCol = 0 ;
        }
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol) ;
        }
        for(int digit=1 ; digit<=9 ; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit ;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true ;
                }
                sudoku[row][col] = 0;
            }

        }
        return true ;
            }
    public static void printBoard(int[][] board){
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] sudoku = { {0,0,8,0,0,0,0,0,0} ,
                            {4,9,0,1,5,7,0,0,2} ,
                            {0,0,3,0,0,4,1,9,0} ,
                            {1,8,5,0,6,0,0,2,0},
                            {0,0,0,0,2,0,0,6,0},
                            {9,6,0,4,0,5,3,0,0},
                            {0,3,0,0,7,2,0,0,4},
                            {0,4,9,0,3,0,0,5,7},
                            {8,2,7,0,0,9,0,1,8}
        };
        if(sudokuSolver(sudoku, 0, 0)){
            printBoard(sudoku);
        }
        else{
            System.out.println("soln doesn't exist");
        }
    }
    }
    

