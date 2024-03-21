import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
        int month,day;
        boolean isError = false;

            System.out.println("||1-January ||2-February ||3-March ||4-April ||5-May ||6-June ||\n" +
                    "||7-July ||8-August ||9-September ||10-October ||11-November ||12-December ||");
            System.out.println("Enter Your Birth Month As A Number : ");
            month = input.nextInt();
            if(month>12 || month <=0){
                System.out.println("Invalid number, please try again!");
                //auto returns to the beginning !
            }else {
                System.out.println("Enter Your Birthday: ");
                day = input.nextInt();

                if ((month == 1 && day <= 21 && day >= 1) || (month == 12 && day >= 22 && day <= 31)) {
                    System.out.println("You are a Capricorn.");
                } else if ((month == 2 && day <= 19 && day >= 1) || (month == 1 && day >= 22 && day <= 31)) {
                    System.out.println("You are an Aquarius.");
                } else if ((month == 3 && day <= 20 && day >= 1) || (month == 2 && day >= 20 && day <= 29)) {
                    System.out.println("You are a Pisces.");
                } else if ((month == 4 && day <= 20 && day >= 1) || (month == 3 && day >= 21 && day <= 31)) {
                    System.out.println("You are an Aries.");
                } else if ((month == 5 && day <= 21 && day >= 1) || (month == 4 && day >= 21 && day <= 30)) {
                    System.out.println("You are a Taurus.");
                } else if ((month == 6 && day <= 22 && day >= 1) || (month == 5 && day >= 22 && day <= 31)) {
                    System.out.println("You are a Gemini.");
                } else if ((month == 7 && day <= 22 && day >= 1) || (month == 6 && day >= 23 && day <= 30)) {
                    System.out.println("You are a Cancer.");
                } else if ((month == 8 && day <= 22 && day >= 1) || (month == 7 && day >= 23 && day <= 31)) {
                    System.out.println("You are a Leo.");
                } else if ((month == 9 && day <= 22 && day >= 1) || (month == 8 && day >= 23 && day <= 31)) {
                    System.out.println("You are a Virgo.");
                } else if ((month == 10 && day <= 22 && day >= 1) || (month == 9 && day >= 23 && day <= 30)) {
                    System.out.println("You are a Libra.");
                } else if ((month == 11 && day <= 21 && day >= 1) || (month == 10 && day >= 23 && day <= 31)) {
                    System.out.println("You are a Scorpio.");
                } else if ((month == 12 && day <= 21 && day >= 1) || (month == 11 && day >= 22 && day <= 30)) {
                    System.out.println("You are a Capricorn.");
                } else {
                    System.out.println("Invalid number, please try again!");
                }
                System.out.println("To start again, please press '1'...");
                int beginning = input.nextInt();
                if (beginning != 1) {
                    break;
                }
            }

        }while(true);
    }
}