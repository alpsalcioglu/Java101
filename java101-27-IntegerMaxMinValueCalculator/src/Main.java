import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            int num, max, min, n;
            System.out.println("How many numbers you want to enter? :");
            n = input.nextInt();

            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;

            for (int i = 1; i <= n; i++) {
                System.out.println("Enter the " + i + ". number: ");
                num = input.nextInt();
                if (num < min)
                    min = num;
                if (num > max)
                    max = num;
            }
            System.out.println("Maximum Value is: " + max);
            System.out.println("Minimum Value is: " + min);

            System.out.println("\nTo Start Again, Please Press '1'...");
            int start = input.nextInt();

            if(start!=1){
                break;
            }

        }while(true);
    }
}