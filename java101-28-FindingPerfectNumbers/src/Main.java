import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            int num, total = 0;

            System.out.print("Enter a number: ");
            num = input.nextInt();

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    total += i;

                }
            }
            if (total / 2 == num) {
                //System.out.println("Total is: "+total);
                System.out.println("-->  ! This Is A Perfect Number. !");
            } else {
                System.out.println("-->  ! This Is Not A Perfect Number. !");
            }
            System.out.print("*******************\nTo Start Again, Please Press '1'...");
            int start = input.nextInt();
            System.out.println("*******************");
            if (start != 1) {
                break;
            }
        }while(true);

    }
}