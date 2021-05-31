import java.util.*;

public class game {
    public static int rida, veerg;
    public static char laud[][] = new char [6][7];
    public static Scanner console = new Scanner(System.in);
    public static char kord = 'X';

    public static void main(String[] args) {
        laud();
        mang();
    }

    //-----mangu laud---

    public static void laud() {
        System.out.println("---1---2---3---4---5---6---7--");

        for(int i = 0; i < 6; i++) {     //placeholder "_"
                for(int j = 0; j < 7; j++){
                laud[i][j] = '_';
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(i + "| ");   //prindib laua vasak seina
            for (int j = 0; j < 7; j++) {
                System.out.print(laud[i][j] + " | "); //prindib ruutude vahe seinad
            }

            System.out.println();
            System.out.println("------------------------------");
        }
    }

    public static void mang() {
        boolean kestab = true;
        while(kestab) {
            rida = 5;
            System.out.println(kord + " mängija kord (veerg): ");
            veerg = console.nextInt();
            laud[rida][veerg] = kord;
            System.out.println(laud[rida]);
            System.out.println(laud[veerg]);
            laud();
        }
    }
}

