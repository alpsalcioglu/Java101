import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        
         int[] arr1 = {1,2,3,4,5};

        double sum = 0.0;
        for(double i =0 ; i <arr1.length ; i++){
            sum +=  1 / (i+1);
        }
        double harmonic = arr1.length / sum;
        System.out.println(harmonic);


    }
}