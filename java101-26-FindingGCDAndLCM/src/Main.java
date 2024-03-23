import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    do {
        int n1, n2;
        int bigN, smallN;
        int gcd, lcm;
        System.out.print("Enter a number(n1) : ");
        n1 = input.nextInt();
        System.out.print("Enter a number(n2) : ");
        n2 = input.nextInt();
        if (n1 >= n2) {
            bigN = n1;
            smallN = n2;
        } else {
            bigN = n2;
            smallN = n1;
        }
        int i = smallN;
        while (i >= 1) {

            if (smallN % i == 0 && bigN % i == 0) {
                gcd = i;
                System.out.println("--> GCD(Greatest Common Divisor) is: " + gcd);
                break;
            }
            i--;
        }
        gcd = i;
        lcm = (n1 * n2) / gcd;
        System.out.println("--> LCM(Least Common Multiple) is: " + lcm);
        System.out.print("\nTo Start Again,Please Press '1'...");
        int start = input.nextInt();
        if (start != 1) {
            break;
        }

    }while(true);


    }
}