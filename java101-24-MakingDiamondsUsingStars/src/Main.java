import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            int n;
            int tempN;

            System.out.println("Enter a number: ");
            n = input.nextInt();
            tempN = n;
            for (int i = 1; i <= tempN; i++) {

                for (int j = 1; j <= (tempN - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i) - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            tempN = n;
            for (int i = tempN - 1; i >= 1; i--) {
                for (int j = 1; j <= (tempN - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i) - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.print("To Start Again, Please Press '1'...");
            int start = input.nextInt();
            if (start != 1) {
                break;
            }
        }while(true);
    }
}