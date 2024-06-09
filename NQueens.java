public class NQueens {
    public static boolean isSafe(char[][] board, int row, int col){
        //columns
        for (int j = row-1; j >=0; j--) {
            if(board[j][col] == 'Q'){
                return false ;
            }
        }
        //diagonally upper left
        for (int i=row-1 , j = col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q'){
                return false ;
            }
        }
        //diagonally upper right
        for (int i=row-1 , j = col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j] == 'Q'){
                return false ;
            }
        }
        return true ;
    }
    public static void printBoard(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    // public static void nQueens(char[][] board , int row){
    //     //base case
    //     if(row == board.length){
    //         System.out.println("----chess board----");
    //         printBoard(board) ;
    //         System.out.println();
    //         return ;
    //     }
    //     for (int j = 0; j < board.length; j++) {
    //         if(isSafe(board, row, j)){
    //             board[row][j] = 'Q' ;
    //             nQueens(board, row + 1);
    //             board[row][j] = 'x' ;

    //         }
    //     }
    // }


    // public static int countNQueens(char[][] board , int row){
    //     //base case
    //     if(row == board.length){
    //         return 1 ;
    //     }
    //     int count = 0 ;
    //     for (int j = 0; j < board.length; j++) {
    //         if(isSafe(board, row, j)){
    //             board[row][j] = 'Q' ;
    //             count = count + nQueens(board, row + 1);
    //             board[row][j] = 'x' ;

    //         }
    //     }
    //     return count ;
    // }

        public static boolean nQueens(char[][] board , int row){
        //base case
        if(row == board.length){
            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)){
                board[row][j] = 'Q' ;
                if(nQueens(board, row + 1)){
                    return true ;
                }
                board[row][j] = 'x' ;

            }
        }
        return false ;
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n] ;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 'x';
            }
        }
        if(nQueens(board, 0)){
            System.out.println("soln exists");
            printBoard(board);
        }
        else{
            System.out.println("soln doesn't exist");
        }
        // System.out.println(countNQueens(board, 0));
    }
}
