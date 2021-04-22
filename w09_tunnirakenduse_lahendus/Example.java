public class Example {
    public void main(String[] args) {
        
        try{

        }catch(ArithmeticException e){
            System.out.println("There was an exeption" + e.getMessage());
        }

        try {
            getArrayElement(3);
        } catch (Exception e) {
            //TODO: handle exception
        }
        int divideByZero = 5 / 0;

        getArrayElement(3);



        System.out.println("game i over, here");
    }

    public static int getArrayElement(int posi){
        int[] intArray = new int[]{ 1, 2, 3 };
        return intArray[posi];
    }
}