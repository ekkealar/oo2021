import java.util.*;

public class TripsTraps {

public static int rida, veerg;
public static char laud[][] = new char [4][4];
public static Scanner console = new Scanner(System.in);
public static char kord = 'X';

public static void main(String[] args) {
   for(int i = 1; i < 4; i++) {     //lisab lauale placeholderiks "_" tahise iga ruudu sisse
       for(int j = 1; j < 4; j++){
           laud[i][j] = '_';
       }
   }

   laud();
   System.out.println("-TripsTrapsTrull-");
   mang();
}

//-----mangu laud---

public static void laud() {
  System.out.println("---1---2---3--");   

  for (int i = 1; i < 4; i++) {     //lisasin 1 yhiku molemale poole et saaks kasutada numbreid 1, 2, 3
      System.out.print(i + "| ");   //prindib laua vertikaaleslt ja horisontaalselt
      for (int j = 1; j < 4; j++) {
          System.out.print(laud[i][j] + " | "); //prindib ruutude vahe seinad
      }

      System.out.println();
      System.out.println("--------------");
  }
}

//-------vaheta mangjate korda ning sisesta nende kaik mangu lauale--------

    public static void mang() {
        boolean kestab = true;
        while(kestab) {
            System.out.println(kord + " mängija kord (rida/veerg)");
            rida = console.nextInt(); //loeb mangija sisendit
            veerg = console.nextInt();
            laud[rida][veerg] = kord;
            if(voitja(rida,veerg)) {
                kestab = false;
                System.out.print(kord + " sina võitsid");
                return;
            }
            laud();
            if(kord == 'X') {
                kord = 'O';
            } else
                kord='X';
        }
    }

    //-------kontrolli voitjat-----------

    public static boolean voitja(int liigutus1, int liigutus2) {
        if(laud[1][liigutus2] == laud[2][liigutus2] && laud[1][liigutus2] == laud[3][liigutus2])
            return true;
        return false;
    }
}