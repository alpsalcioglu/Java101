import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year,remainder;
        do {
            System.out.println("---Leap Year Calculator---\nEnter a year: ");
            year = input.nextInt();
            remainder = year % 4;
            if (year > 0) {
                if (remainder == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println(year + " is a leap year! ");
                        } else {
                            System.out.println(year + " is not a leap year! ");
                        }
                    } else {
                        System.out.println(year + " is a leap year! ");
                    }
                } else {
                    System.out.println(year + " is not a leap year! ");
                }
            } else {
                System.out.println("Enter a valid number! ");
            }
            System.out.println("To Start Again, Please Press '1'...");
            int start = input.nextInt();
            if (start != 1) {
                break;
            }
        }while(true);


    }
}