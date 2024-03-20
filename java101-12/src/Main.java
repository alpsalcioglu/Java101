import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            int n1, n2, n3;
            System.out.println("Numbers should be different.");
            System.out.println("Enter the 1. number: ");
            n1 = input.nextInt();
            System.out.println("Enter the 2. number: ");
            n2 = input.nextInt();
            System.out.println("Enter the 3. number: ");
            n3 = input.nextInt();

            if (n1 < n3 && n1 < n2) {
                if (n2 < n3) {
                    System.out.println(n1 + "<" + n2 + "<" + n3);
                } else if (n3 < n2) {
                    System.out.println(n1 + "<" + n3 + "<" + n2);
                }
            } else if (n2 < n3 && n2 < n1) {
                if (n1 < n3) {
                    System.out.println(n2 + "<" + n1 + "<" + n3);
                } else if (n3 < n1) {
                    System.out.println(n2 + "<" + n3 + "<" + n1);
                }
            } else if (n3 < n1 && n3 < n2) {
                if (n1 < n2) {
                    System.out.println(n3 + "<" + n1 + "<" + n2);
                } else if (n2 < n1) {
                    System.out.println(n3 + "<" + n2 + "<" + n1);
                }
            }
            System.out.println("To start again, press '1'...");
            int beginning=input.nextInt();
            if(beginning!=1){
                break;
            }
        }while(true);
    }
}