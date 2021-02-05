public class First {
  public static void main(String[] args){
    //System.out.println(args.length);
    int[] numberArray = new int[5];
    int numberArray2[] = new int[5];

    String[] stringArray = new String[5];
    String[] greetingsArray = new String[]{ "Hello", "world", "!" }; // algväärustamisega

    String name = "Raimo";
    
    // primitiivtüübid
    int myInt = Integer.MAX_VALUE;
    long myLong = Long.MAX_VALUE;
    byte myByte = Byte.MAX_VALUE; // -128 to 127
    short myShort = Short.MAX_VALUE;
    double myDouble = 3.4;
    float myFloat = 3.4f;
    boolean flag = true; // false
    char character = 'F';
    
    // fori tsükkel
    for (int i = 0; i < greetingsArray.length; i++){ // for (int i = 0; i < args.length; i++){
      System.out.println(greetingsArray[i]); // System.out.println(args[i]);
    }
    
    // foreach tsükkel
    for (String text : greetingsArray){ // for (String text : args) {
      System.out.println(text);
    }
    
    // while tsükkel
    int length = greetingsArray.length; // args.length
    while (length > 0){
      length--;
      System.out.println("Inside while");
    }
    
    int year = 2021;

    if (year == 2021){
      System.out.println(year + " is equal to 2021");
    } else if (year > 2021){
      System.out.println(year + " is larger than 2021");
    } else {
      System.out.println(year + " is not equal or larger to 2021");
    }

    System.out.println("Hello world");
    System.out.print("\n");

    String hello = "Hello world!";
  }
}

// javac First.java
// java First
// java First 1 2 3 4 5 6