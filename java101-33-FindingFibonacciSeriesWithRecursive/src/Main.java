import java.util.Scanner;
public class Main {

    static int fib(int n){
        if(n==1 || n==2){
            return 1;
        }if(n==0){
            return 0;
        }

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            int temp = number;
            number -= 1;
            System.out.println("The " + temp + ". element of " +
                    "the fibonecci series is: " + fib(number));
            System.out.println("To Start Again,Please Press 1...");
            int start = input.nextInt();
            if (start != 1) {
                break;
            }
        }while(true);

    }
}