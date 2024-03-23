import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = input.nextInt();

        System.out.println("Prime numbers up to "+num+": ");
        for (int i = 2; i <= num; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                System.out.print(i + " ");
            }

        }
    }
}