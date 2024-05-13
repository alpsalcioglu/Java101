import java.util.Scanner;
public class Main {
   static void recursive(int n){
       if(n<=0){
           System.out.print(n+" ");
           return;
       }
       System.out.print(n+ " ");
       recursive(n-5);
       System.out.print(n+ " ");





   }
    public static void main(String[] args) {
       do {
           Scanner input = new Scanner(System.in);
           System.out.print("Enter a number: ");
           int number = input.nextInt();
           recursive(number);
           System.out.println(" ");
           System.out.print("To start again,please press 1...");
           int start = input.nextInt();
           if (start != 1) {
               break;
           }
       }while(true);

    }
}