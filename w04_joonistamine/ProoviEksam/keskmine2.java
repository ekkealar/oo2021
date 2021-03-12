package ProoviEksam;

public class keskmine2 {
    public static void main(String[] args) {
        int[] sisend = {4, 8, 9, 7, 2, 5};
        int n = sisend.length - 2; 
        int sum = 0;
        //int[] valjund = {};

        for(int i = 0; i + 1 < n; i++){
            sum = sisend[i] + sisend[i + 1];
            System.out.print(sum + " ");
        };

    }
    
}
