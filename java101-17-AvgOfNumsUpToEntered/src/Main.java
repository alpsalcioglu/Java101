import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        do {
        long total = 0;
        long average;
        long divisibleNums=0;

            System.out.print("Enter a number : ");
            int num = input.nextInt();
            //System.out.println("Divisible by 3 and 4 numbers: ");
            for (int i = 1; i < num; i++) {
                if (i % 3 == 0 && i % 4 == 0) {
                    total += i;
                    divisibleNums++;

                    //System.out.print("| " + i + " |");


                }
            }
            System.out.print("\n");
            if (divisibleNums > 0) {
                average = total / divisibleNums;
                System.out.println("--> The sum of numbers divisible by 3 and 4: -> " + total);
                System.out.println("--> Number of numbers divisible by 3 and 4: -> " + divisibleNums);
                System.out.println("--> AVERAGE of numbers divisible by 3 and 4 : -> " + average);
            } else {
                System.out.println("There are no numbers divisible by 3 and 4...");
            }
            System.out.println("To start again, please press '1'...");
            int start = input.nextInt();
            if (start != 1) {
                break;
            }
        }while(true);


    }
}