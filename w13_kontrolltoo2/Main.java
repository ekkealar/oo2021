import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String content = new Scanner(new File("text.txt")).useDelimiter("\\Z").next();
        printLastChar(content);

    }

    static void printLastChar(String content)
    {

        for (int i = 1; i < content.length(); i++) {
  
            if (content.charAt(i) != '.')
                if (content.charAt(i) == ' ')
                System.out.print(content.charAt(i - 1) + " ");
        }
    }
}
