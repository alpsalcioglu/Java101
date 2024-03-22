import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner input =  new Scanner(System.in);
      do {
          int num, numVariable, result, total = 0;
          int digitCount = 0;
          System.out.print("Enter a number: ");
          num = input.nextInt();
          int tempNum = num;

          while (tempNum != 0) {
              tempNum /= 10;
              digitCount++;
          }
          System.out.println("The number you entered has " + digitCount + " digits.");
          tempNum = num;
          while (tempNum != 0) {
              numVariable = tempNum % 10;
              result = 1;
              for (int i = 1; i <= digitCount; i++) {
                  result *= numVariable;
                  //System.out.println(result);

              }
              total += result;
              tempNum /= 10;
          }
          tempNum = num;
          if (total == num) {
              System.out.println("This is an Armstrong Number!");
          } else {
              System.out.println("This is not an Armstrong Number!");
          }
          System.out.print("To Start Again, Please Press 1...");
          int start = input.nextInt();
          if (start != 1) {
              break;
          }
      }while(true);


    }
}