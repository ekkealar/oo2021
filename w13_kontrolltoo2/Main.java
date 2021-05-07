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
        content = content.replaceAll("[^a-zA-Z0-9]", " ");

        String characters = "";

        for (int i = 1; i < content.length(); i++) {
            if (content.charAt(i) == '.'){
                characters += (content.charAt(i - 2));
                // System.out.print(content.charAt(i - 2) + " ");
            } else if (content.charAt(i) == ' ' && content.charAt(i) != '.') {
                // System.out.print(content.charAt(i - 1) + " ");
                characters += (content.charAt(i - 1));
            }
        }

    }
}
