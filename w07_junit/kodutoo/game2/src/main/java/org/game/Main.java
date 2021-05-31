package org.game;
import java.util.*;

public class Main {
    public static Scanner console = new Scanner(System.in);
    public static int Width = 9, Height = 8;
    public static char[][]board= new char [Width][Height];
    public static char turn  = 'O';
    public static int Row = 0, Column = 0;
    private final static char Blank = '.';
    private static String winMessage = null;

    public static void main( String[] args )
    {
        
        for(int width=0; width < Width; width++){
            for(int height=0; height < Height; height++){
                board[width][height]=Blank;
            }
        }	
        
        drawBoard();
        mang();
    }

    public static void mang() {
        boolean kestab = true;
        while(kestab) {
            winMessage = "False";
            System.out.println(turn + " mängija kord (veerg): ");
            Column = console.nextInt();
            Row = 6;
            Width = Column;
            Height = Row;

            while(board[Width][Height] != Blank){
                Height--;
            }
            board[Width][Height] = turn;
            isWinner();
            System.out.println(board[Width]);          
            System.out.println(board[Height]);          
            System.out.println(board[Width][Height]);        
            drawBoard();

            if(winMessage == "True") {
                kestab = false;
                System.out.print(turn + " sina võitsid");
                return;
            }
            if(turn == 'X') {
                turn = 'O';
            } else
                turn='X';
        }
    }

    public static void isWinner(){
        //horisontaalne kontroll
        for(int Row = 0; Row < 6; Row++){
            for (int Column = 0;Column < 9 ;Column++){
                if (board[Width][Height] == turn && 
                    board[Width + 1][Height] == turn &&
                    board[Width + 2][Height] == turn &&
                    board[Width + 3][Height] == turn){
                    winMessage = "True";
                }
            }			
        }
        for(int Row = 0; Row < 6; Row++){
            for (int Column = 0;Column < 9 ;Column++){
                if (board[Width][Height] == turn && 
                    board[Width - 1][Height] == turn &&
                    board[Width - 2][Height] == turn &&
                    board[Width - 3][Height] == turn){
                    winMessage = "True";
                }
            }			
        }

        //vertikaalne kontroll
        for(int Row = 0; Row < 6; Row++){
			for(int Column = 0; Column < 9; Column++){
				if (board[Width][Height] == turn && 
					board[Width][Height + 1] == turn &&
					board[Width][Height + 2] == turn &&
					board[Width][Height + 3] == turn){
                    winMessage = "True";
				}
			}
		}

        //diagonaali kontroll
        for(int Row = 0; Row < 6; Row++){
			for(int Column = 0; Column < 9; Column++){
				if (board[Width][Height] == turn && 
				    board[Width + 1][Height + 1] == turn && 
				    board[Width + 2][Height + 2] == turn && 
				    board[Width + 3][Height + 3] == turn){
                    winMessage = "True";
				}
			}
		}
    }

    public char getTurn(){
        return turn;
    }
    public int getWidth(){
        return Width;
    }
    public int getHeight(){
        return Height;
    }
}
