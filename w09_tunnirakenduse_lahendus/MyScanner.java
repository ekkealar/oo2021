import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("data.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(scanner.nextLine());
        }

    }
}
