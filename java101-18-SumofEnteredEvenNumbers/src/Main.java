import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     do {
         int num;
         int total = 0;
         System.out.println("******************************");
         do {
             System.out.println("Enter a number: ");
             num = input.nextInt();
             if (num % 2 == 0 && num % 4 == 0) {
                 total += num;
             }
         } while (num % 2 == 0);
         System.out.println("The sum of the numbers you " +
                 "entered that are even and also divisible by 4: \n-> " + total);
         System.out.println("To start again,please press '1'...");
         int start=input.nextInt();
         if(start!=1){
             break;
         }
     }while(true);
    }
}