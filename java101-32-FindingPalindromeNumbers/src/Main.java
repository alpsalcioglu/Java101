import java.util.Scanner;

public class Main {
    static boolean isPalindrome(int number){
        int temp = number, reverseNumber = 0,lastNumber;
    while(temp!=0){
        //System.out.println("========================");
       // System.out.println("Number-> "+ temp);
        lastNumber = temp %10;
        //System.out.println("Last Digit-> "+ lastNumber);
        reverseNumber = (reverseNumber * 10 ) + lastNumber;
       // System.out.println("New Number-> "+ reverseNumber);
        temp /=10 ;
        // System.out.println("New Temp-> "+ temp);
    }
    if(reverseNumber ==number) {
    return true;
    }else{
    return false;
    }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       do {
           System.out.print("Enter a number: ");
           int enterNumber = input.nextInt();
           System.out.println(isPalindrome(enterNumber));
           System.out.println("To Start Again, Please Press 1...");
           int start = input.nextInt();
           if(start!=1){
               break;
           }
       }while(true);

    }
}