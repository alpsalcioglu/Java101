import java.util.Scanner;
public class Main{
    static int recursiveExponential(int base,int exponent){
        if(exponent==0){
            return 1;
        }else{
            return base*recursiveExponential(base, exponent-1);
        }
    }

    public static void main(String[] args){
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the base: ");
            int base = input.nextInt();
            System.out.print("Enter the exponent: ");
            int exponent = input.nextInt();

            int result = recursiveExponential(base, exponent);
            System.out.println("Result is: " + result);
            System.out.println("To start again, please press 1...");
            int start = input.nextInt();
            if(start!=1){
                break;
            }
        }while(true);


    }


}