
public class Board
{
    public static void main(String[] args)
    {
        // fill alternating elements with 0 1 ...
        int[][] board = new int[8][8];
        for (int row = 0; row < board.length; row++)
        {
           for (int column = 0; column < board[0].length; column++)
          {
            board[row][column] = (row + column) % 2;
          }
        }


        //print the array
        for (int row = 0; row < board.length; row++)
        {
           for (int column = 0; (board[row] != null && column < board[row].length); column++)
             System.out.print(board[row][column] + " ");

         System.out.println();

        }

    }
   
}

