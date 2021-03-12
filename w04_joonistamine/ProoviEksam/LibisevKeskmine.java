
package ProoviEksam;
import java.util.Scanner;

public class LibisevKeskmine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = sc.nextInt();

        System.out.print("Enter third number: ");
        int thirdNum = sc.nextInt();
        sc.close();

        System.out.print("The average is: " + average(firstNum, secondNum, thirdNum));
    }

    public static int average(int a, int b, int c){
        return (a + b + c) / 3;
    } 
}
