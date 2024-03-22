import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num,i,j;
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            System.out.println("Power of 4: ");
            for (i = 1; i <= num; i *= 4) {
                System.out.print("| " + i + " |");
            }
            System.out.println("\nPower of 5: ");
            for (j = 1; j <= num; j *= 5) {
                System.out.print("| " + j + " |");
            }
            System.out.println("\nTo start again, please press '1'...");
            int start = input.nextInt();
            if (start != 1) {
                break;
            }
        }while(true);
    }
}