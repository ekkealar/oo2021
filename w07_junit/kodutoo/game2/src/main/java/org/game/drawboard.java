package org.game;

public class drawboard{
    public static int Width = 9, Height = 8;
    public static char[][]board= new char [Width][Height];

    public static void drawBoard() {
        System.out.println("---1---2---3---4---5---6---7--");

        for (int i = 1; i < 7; i++) {
            System.out.print(i + "| ");   //prindib laua vasak seina
            for (int j = 1; j < 8; j++) {
                System.out.print(board[j][i] + " | "); //prindib ruutude vahe seinad
            }
            System.out.println();
            System.out.println("------------------------------");
        }
    }
}
