package Homework;

import java.util.ArrayList;

public class Homework {

  static ArrayList<String> other = new ArrayList<>();
  public static void main(String[] args) {
    System.err.println("Started");
    doSomething();

    Homework hw = new Homework();

    System.out.println(hw.add(3, 4));
    System.out.println(hw.add(10, 15));
  }

  public static void doSomething(){
    System.out.println("Doing something");
  }

  public int add(int a, int b){
    return a + b;
  }
}
