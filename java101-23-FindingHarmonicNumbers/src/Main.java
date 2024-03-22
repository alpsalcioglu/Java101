import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      do {
          int num;
          System.out.println("**********\n*   1    *");
          System.out.print("*  ---   *\n*  (n)   *\n**********" +
                  "  : Enter a number(n) to find its harmonic series: ");
          num = input.nextInt();
          double result = 0;
          for (double i = 1; i <= num; i++) {
              result += (1 / i);

          }
          System.out.println("Harmonic series of this number is : " + result);

          System.out.print("To Start Again,Please Press '1'...");
          int start = input.nextInt();
          if (start != 1) {
              break;
          }
      }while(true);



    }
}