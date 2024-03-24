import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            int elemNumber, num1 = 0, num2 = 1,n=3;
            System.out.println("Enter the number of elements: ");
            elemNumber = input.nextInt();
            System.out.println("----> " + elemNumber + " element Fibonacci series: ");

            if (elemNumber >= 1) {
                System.out.println("1. element --> " + num1);
            }
            if (elemNumber >= 2) {
                System.out.println("2. element --> " + num2);
            }
            for (int i = 3; i <= elemNumber ; i++) {
                int bigNum = num1 + num2;
                System.out.println(n + ". element --> " + bigNum);
                num1 = num2;
                num2 = bigNum;
                n++;
            }
            System.out.println("To Start Again, Please Press '1'...");
            int start = input.nextInt();
            if (start != 1) break;
        }while(true);
    }
}