import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     do {
         long base, exponent;
         long total = 1;
         System.out.println("******************\n  b\na\n******************");
         System.out.print("Enter the base(a) number: ");
         base = input.nextInt();
         System.out.print("Enter the exponent(b) number: ");
         exponent = input.nextInt();
         for (int i = 1; i <= exponent; i++) {
             total = total * base;
         }
         System.out.println("******************\n" +
                 "  " + exponent + "\n" + base + "   --> The result is: " + total +
                 "\n******************");
         System.out.println("\nTo Start Again,Please Press '1'...  ");
         int start=input.nextInt();
         if(start!=1){
             break;
         }
     }while(true);
    }
}