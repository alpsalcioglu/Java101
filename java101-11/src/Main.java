import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            double heat;
            System.out.print("What is the temperature? :");
            heat = input.nextDouble();
            if (heat < 5) {
                System.out.println("You can go skiing. ");
            } else if (heat >= 5 && heat < 15) {
                System.out.println("You can go to the cinema. ");
            } else if(heat == 15){
                System.out.println("You can go to the cinema. ");
                System.out.println("You can go for a picnic. ");
            }
            else if (heat > 15 && heat <= 25) {
                System.out.println("You can go for a picnic. ");
            } else if (heat > 25) {
                System.out.println("You can go swimming. ");
            }
            System.out.println("To start again, press '1'...");
            int beginning = input.nextInt();
            if (beginning != 1) {
                break;
            }
        }while(true);
    }
}