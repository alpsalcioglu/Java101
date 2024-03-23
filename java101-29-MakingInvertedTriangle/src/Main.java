import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        do {
            int digit, i;

            System.out.print("Enter A Digit Number: ");
            digit = input.nextInt();

            for (i = digit; i >= 1; i--) {
                
                for (int k = 1; k <= (2 * i) - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("To Start Again, Please Press '1'...");
            int start = input.nextInt();
            if (start != 1) {
                break;
            }
        }while(true);
    }
}