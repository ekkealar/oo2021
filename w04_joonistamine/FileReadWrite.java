import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * FileReadWrite
 */
public class FileReadWrite {
    public static void main(String[] args)  throws IOException {
    File file = new File("dummy.txt");
    File fileWrite = new File("out_dummy.txt");
       /* System.out.println(
            file.getName()  + "\n" +
            file.isDirectory() + "\n" +
            file.lastModified()
        ); */

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
        String line = br.readLine();
        while (line != null){
            String[] lineData = line.split(",");

            System.out.println(lineData[0] + " | " + lineData[lineData.length-1]);
            line = br.readLine();
        }

        fr.close();
        br.close();

        if (!fileWrite.exists()){
            fileWrite.createNewFile();
        }

        PrintWriter pw = new PrintWriter(fileWrite);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String line2 = scanner.nextLine();
            String[] lineData = line2.split(",");
            pw.println(
                "number is " + lineData[0] + 
                "and name is " + lineData[1] +
                "and " + lineData[2]
            );
        }

        scanner.close();
        pw.close();

        
    }
    
}