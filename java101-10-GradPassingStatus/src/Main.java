import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      do {
          double maths, physics, turkish, chemistry, music;
          double average;
          System.out.println("Enter your maths result: ");
          maths = input.nextDouble();
          while (maths > 100 || maths < 0) {
              System.out.println("Please enter a note between 0 and 100 !\n" +
                      "Enter again: ");
              maths = input.nextDouble();
          }
          System.out.println("Enter your physics result: ");
          physics = input.nextDouble();
          while (physics > 100 || physics < 0) {
              System.out.println("Please enter a note between 0 and 100 !\n" +
                      "Enter again: ");
              physics = input.nextDouble();
          }
          System.out.println("Enter your turkish result: ");
          turkish = input.nextDouble();
          while (turkish > 100 || turkish < 0) {
              System.out.println("Please enter a note between 0 and 100 !\n" +
                      "Enter again: ");
              turkish = input.nextDouble();
          }
          System.out.println("Enter your chemistry result: ");
          chemistry = input.nextDouble();
          while (chemistry > 100 || chemistry < 0) {
              System.out.println("Please enter a note between 0 and 100 !\n" +
                      "Enter again: ");
              chemistry = input.nextDouble();
          }
          System.out.println("Enter your music result: ");
          music = input.nextDouble();
          while (music > 100 || music < 0) {
              System.out.println("Please enter a note between 0 and 100 !\n" +
                      "Enter again: ");
              music = input.nextDouble();
          }

          average = (maths + physics + turkish + chemistry + music) / 5;
          if (average >= 55) {
              System.out.println("You passed!\n" +
                      "Your score is: "+ average);
          } else {
              System.out.println("You did not pass the class!\n" +
                      "Your Score is Above 55.\n" +
                      "Your score: " +average);
          }

          System.out.println("To return to the beginning and calculate again, press '1' please...");
          int beginning = input.nextInt();
          if (beginning != 1) {
              break;
          }
      }while(true);
    }
}