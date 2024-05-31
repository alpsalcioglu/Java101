
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 10;
        int selected ;

        //System.out.println(number);
        System.out.println("Your right: " + right);
        while(right>0) {

            System.out.print("**********\nGuess a number between 1-100: ");
            selected = input.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a number between 0 and 100... ");
            }if(selected>number && selected<100 && selected>0){
                System.out.println("Wrong! That guess is bigger than the real number,Try again...");
                right--;
                System.out.println("Remaining right: " + right);
            }if(selected<number && selected<100 && selected>0){
                System.out.println("Wrong! That guess is smaller than the real number,Try again...");
                right--;
                System.out.println("Remaining right: " + right);
            }if(selected==number){
                System.out.println("**********\nYou found it!");
                System.out.println("--> The number is: " + number);
                break;
            }
        }
        if(right==0){
            System.out.println("**********\nYour right is over!");
        }






        }
}