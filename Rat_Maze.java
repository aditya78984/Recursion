public class Rat_Maze {
    public static void printBoard(int[][] board){
        for (int i = 0; i <board.length; i++) {
            for (int j = 0; j <board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    // public static void allPaths(int[][] maze, int[][] ans , int row, int col){
    //     if(row == maze.length-1 && col == maze.length-1){
    //         ans[row][col] =1 ;
    //         printBoard(ans) ;
    //         return;
    //     }
    //     if(maze[row][col] == 0){
    //         return ;
    //     }
    //     maze[row][col] = 0;
    //     ans[row][col] = 1;
    //     if(col < maze.length-1){
            
    //         allPaths(maze, ans, row, col+1);
    //     }
    //     if(row < maze.length-1){
    //         allPaths(maze, ans, row+1, col);
    //     }
    //     if(col > 0){
    //         allPaths(maze, ans, row, col-1);
    //     }
    //     if(row > 0){
    //         allPaths(maze, ans, row-1, col);
    //     }
    //     maze[row][col] = 1;
        
    // }

    public static void allPaths(int[][] maze, int[][] ans , int row, int col){
        if(row == maze.length-1 && col == maze.length-1){
            ans[row][col] =1 ;
            System.out.println();
            printBoard(ans) ;
            return;
        }
        if(ans[row][col] == 1){
            return ;
        }
        
        ans[row][col] = 1;
        if(col < maze.length-1){
            
            allPaths(maze, ans, row, col+1);
        }
        if(row < maze.length-1){
            allPaths(maze, ans, row+1, col);
        }
        if(col > 0){
            allPaths(maze, ans, row, col-1);
        }
        if(row > 0){
            allPaths(maze, ans, row-1, col);
        }
        
        
    }
    public static void main (String[] args){
        int[][] maze =  { { 1, 0, 0, 0 },
        { 1, 1, 0, 1 },
        { 0, 1, 0, 0 },
        { 1, 1, 1, 1 } }; 
        int[][] ans =  { { 0, 0, 0, 0 },
        { 0, 0, 0, 0 },
        { 0, 0, 0, 0 },
        { 0, 0, 0, 0 } }; 

        allPaths(maze, ans,0,0);
        
    }
}
