import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        func();
        
    }

    public static void func(){
        int num;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();
        sc.close();

        Double root = Math.sqrt(num);
        Double square = Math.pow(num, 2);

        System.out.println("ruutjuur on: " + root + " ning ruudus on: " + square);
    }

    
}