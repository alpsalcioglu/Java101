import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     do {
         double distance, distancePrice = 0.10, totalPrice, discount, discountedPrice, discountTotal;
         int type, age;
         System.out.print("Enter the distance in km: ");
         distance = input.nextDouble();
         System.out.print("Enter your age: ");
         age = input.nextInt();
         System.out.print("Enter the trip type.\nPress '1' for One Way Trip. || Press '2' for Round Trip. : ");
         type = input.nextInt();
         if (distance>0 && age >0) {
             if (age < 12) {
                 discount = 0.50;
             } else if (age >= 12 && age < 24) {
                 discount = 0.10;
             } else if (age > 65) {
                 discount = 0.30;
             } else {
                 discount = 0;
             }

             totalPrice = distance * distancePrice;
             discountTotal = totalPrice * discount;
             discountedPrice = totalPrice - discountTotal;
             if (type == 1) {
                 System.out.println("Total price is: " + discountedPrice);
             } else if (type == 2) {
                 double twoWayPrice = (discountedPrice - (discountedPrice * 0.20)) * 2;
                 System.out.println("Total price is: " + twoWayPrice);
             } else {
                 System.out.println("Please enter a valid number!");
             }
         }else {
             System.out.println("Please enter a valid number!");
         }

         System.out.println("To start again press 3: ");
         int start = input.nextInt();
         if (start != 3) {
             break;
         }
     }while(true);


    }
}