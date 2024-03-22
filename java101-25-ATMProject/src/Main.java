import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int right=2,menu;
        boolean check = false;
        boolean check2 =false;
        while(right>=0 && (check==false || check2==false))  {
            String nickname, password;

            int money, balance = 1500;
            System.out.println("Enter Your Nickname: ");
            nickname = input.next();
            System.out.println("Enter Your Password: ");
            password = input.next();
            if (nickname.equals("alpinho1") && password.equals("alp1234")) {
                do {
                    System.out.println("Welcome to ALPBANK, Please Select: " +
                            "\n1-Withdraw Money\n2-Deposit Money\n3-Balance Inquiry\n4-Safe Exit");
                    int select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Enter the amount of money you want to withdraw: ");
                            money = input.nextInt();
                            if (money > balance) {
                                System.out.println("Insufficient Balance ");
                                break;
                            } else {
                                balance -= money;
                                System.out.println("Successful Withdrawal!\nYou have " + balance + " left in your account.");
                                System.out.println("If you want to go to the main menu, please press '0'..");
                                 menu=input.nextInt();
                                if(menu==0){
                                    check=false;
                                }else{
                                    check=true;
                                }
                            }
                            break;

                        case 2:
                            System.out.print("Enter the amount of money you want to deposit: ");
                            money = input.nextInt();
                            balance += money;
                            System.out.println("Successful Deposit!\nYou have " + balance + " in your account now.");
                            check = true;
                            System.out.println("If you want to go to the main menu, please press '0'..");
                             menu=input.nextInt();
                            if(menu==0){
                                check=false;
                            }else{
                                check=true;
                            }
                            break;
                        case 3:
                            System.out.println("You have " + balance + " in your account.");
                            System.out.println("If you want to go to the main menu, please press '0'..");
                             menu=input.nextInt();
                            if(menu==0){
                                check=false;
                            }else{
                                check=true;
                            }
                            break;
                        case 4:
                            System.out.println("Safe Exit Successful!");
                           check=true;
                            System.out.println("If you want to login again,please press '0'...");
                            menu=input.nextInt();
                            if(menu==0){
                                check2=false;
                                right=2;
                            }
                            else{
                                check2=true;
                            }
                            break;
                        default:
                            System.out.println("Invalid number!");
                            System.out.println("If you want to go to the main menu, please press '0'..");
                            menu=input.nextInt();
                            if(menu==0){
                                check=false;
                            }else{
                                check=true;
                            }
                    }
                }while(check==false);
            } else if(right!=0){
                System.out.println("Invalid Login!");
                System.out.println("You have " + right + " entries left...");
                right--;

            }else{
                System.out.println("You have "+right+" entries left. Please contact with your customer service...");
                break;
            }
        }


    }
}
