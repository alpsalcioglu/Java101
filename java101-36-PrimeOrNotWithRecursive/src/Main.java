import java.util.Scanner;

public class Main {
    static boolean isPrime(int number,int divisor){
        if(divisor==1){
            return true;
        }else{
            if(number %divisor==0){
                return false;
            }else{
                return isPrime(number,divisor-1);
            }
        }

    }
    public static void main(String[] args) {
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            boolean result = isPrime(number, number / 2);

            if (result) {
                System.out.println(number + " is a Prime Number!");
            } else {
                System.out.println(number + " is not a Prime Number!");
            }
            System.out.println("To start again, please press 1...");
            int start = input.nextInt();
            if (start != 1) {
                break;
            }
        }while(true);


    }
}