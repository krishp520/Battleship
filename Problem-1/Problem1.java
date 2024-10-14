/*
 * CSCI 1110 - Assignment 2 - Problem 1
 * Author: Krish Patel
 * Banner ID: <B00946672>
*/
// WRITE YOUR CODE HERE
import java.util.*;
public class Problem1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //Reading integer number and initialising array of boards
        String[][] board1 = new String[size][size];
        String[][] board2 = new String[size][size];
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                board1[i][j] = "-";
                board2[i][j] = "-";
            }
        }
        int numberOfBoats = sc.nextInt();
        //Adding boats for each player on the board
        for(int i = 1; i <= (numberOfBoats * 2); i++) 
        {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int boatSize = sc.nextInt();
            int direction = sc.nextInt();
            //Place the boat accordingly for each player 
            if (i % 2 == 1) 
            {
                board1[row][col] = "B";
                for (int j = 1; j <= boatSize - 1; j++) 
                {
                    if (direction == 0) 
                    {
                        if (col + j < size) 
                        {
                            board1[row][col + j] = "B";
                        }
                    } else 
                    {
                        if (row + j < size) 
                        {
                            board1[row + j][col] = "B";
                        }
                    }
                }
            } 
            else 
            {
                board2[row][col] = "B";
                for (int j = 1; j <= boatSize - 1; j++) 
                {
                    if (direction == 0) 
                    {
                        if (col + j < size) 
                        {
                            board2[row][col + j] = "B";
                        }
                    }
                    else 
                    {
                        if (row + j < size) 
                        {
                            board2[row + j][col] = "B";
                        }
                    }
                }
            }
        }
        //Print both players board
        printBoard(board1,board2,size);
        //Loop to process shots and update the board
        int shots = sc.nextInt();
        for (int i = 1; i <= (shots * 2); i++) 
        {
            int row = sc.nextInt();
            int col = sc.nextInt();
            if (i % 2 == 1) 
            {
                board2[row][col] = "X";
            } 
            else 
            {
                board1[row][col] = "X";
            }
        }
        //Print both players board and determining the winner and printing it.
        printBoard(board1,board2,size);
        System.out.println(winner(board1,board2,size));
    }
    //Method to print both players board with proper formatting
    public static void printBoard(String[][] board1, String[][] board2, int size)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<(size*2);j++)
            {
                if (j == size)
                {
                    System.out.print("\t");
                }
                if(j<size)
                {
                    System.out.print(board1[i][j]);
                }
                else
                {
                    System.out.print(board2[i][j - size]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    //Method to determine the winner of the game
    public static String winner(String[][] board1, String[][] board2, int size)
    {
        boolean player1won = true;
        boolean player2won = true;
        String win = "";
        //Check each cell of the board for boats using loops
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(board1[i][j].equals("B"))
                {
                    player2won = false;
                }
                if(board2[i][j].equals("B"))
                {
                    player1won = false;
                }
            }
        }
        //Storing the output to a string based on the result of the game
        if(!player1won && !player2won)
        {
            win = "Draw!";
        }
        else if(player1won && !player2won)
        {
            win = "P1 Won!";
        }
        else if(!player1won && player2won)
        {
            win = "P2 Won!";
        }
        else if(player1won && player2won)
        {
            win = "All Destroyed";
        }
        return win;
    }
}
