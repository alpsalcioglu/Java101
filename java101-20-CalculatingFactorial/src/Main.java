import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        do {
            long num, num2, j, i, d, total3 = 1, total2 = 1, total1 = 1, result;
            //C(a,b) = a! / (b! * (a-b)!)
            System.out.println("Enter the numbers you want to calculate the combination. C(a,b) ");
            System.out.print("Enter the first(a) number: ");
            num = input.nextInt();
            System.out.println("C(" + num + " , b)");
            System.out.print("Enter the second(b) number: ");
            num2 = input.nextInt();
            long difference = num - num2;
            if(difference<0){
                System.out.println("The first number should be bigger than the second number!");
            }else {
                System.out.println("Difference: " + difference);
                for (i = 1; i <= num; i++) { // a!
                    total1 = total1 * i;
                }
                for (j = 1; j <= num2; j++) { //b!
                    total2 = total2 * j;
                }
                for (d = 1; d <= difference; d++) { // (a-b)!
                    total3 = total3 * d;
                }

                result = total1 / (total2 * total3);
                System.out.println("C(" + num + " , " + num2 + ") --> The result is: " + result);
            }
            
            System.out.print("\nTo Start Again, Please Press '1'...  ");
            int start = input.nextInt();
            if (start != 1) {
                break;
            }
        }while(true);


    }
}