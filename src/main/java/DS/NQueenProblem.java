package DS;

public class NQueenProblem {
    public static void main(String[] args) {

    }
    public static boolean nQueen(int board[][], int row)
    {
        int n=board.length;
        if(row==n)
            return true;

        for (int col = 0; col < n; col++) {
            if(isSafe(board,row,col))
            {
                board[row][col]=1;
                if(nQueen(board,row+1))return true;
                board[row][col]=0;
            }

        }return false;


    }

    static boolean isSafe(int board[][], int row, int col)
    {
        int N=board.length;
        int i, j;

        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }
}
