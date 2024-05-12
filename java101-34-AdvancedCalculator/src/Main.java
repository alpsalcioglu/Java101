import java.util.Scanner;
public class Main {

    static void plus(){
        Scanner input = new Scanner(System.in);
        int number, result = 0, i=1;
        while(true){

            System.out.print(i++ + ". number: ");
            number = input.nextInt();
            if(number==0){
                break;
            }
            result = result + number;
        }
        System.out.println("Result: "+result);
    }

    static void minus(){
        Scanner input = new Scanner(System.in);
        int number,result=0,counter;
        System.out.print("How many numbers do you want to enter?: " );
        counter = input.nextInt();
        for(int i=1;i<=counter;i++){
            System.out.print(i + ". number:");
            number = input.nextInt();
            if(i==1){
                result +=number;
                continue;
            }
            result -=number;
        }
        System.out.println("Result: "+result);
    }

    static void times(){
        Scanner input = new Scanner(System.in);
        int number,result=1,i=1;
        while(true){
            System.out.print(i++ + ". number: ");
            number = input.nextInt();
            result *=number;
            if(number==1){
                break;
            }
        }
        System.out.println("Result: " + result);
    }

    static void divided(){
        Scanner input = new Scanner(System.in);
        double result=0.0,counter;
        int number;
        System.out.print("How many numbers do you want to enter?: ");
        counter = input.nextDouble();
        for(int i = 1; i<=counter ; i++){
            System.out.print(i + ". number: ");
            number=input.nextInt();
            if(i==1 && number ==0 ){
                System.out.println("Invalid number! ");
                break;
            }
            if(i==1){
                result = number;
                continue;
            }
            result /=number;
        }
        System.out.println("Result: " + result);
    }

    static void power(){
        Scanner input = new Scanner(System.in);
        int base,power,result=1;
        System.out.print("Enter the base: ");
        base = input.nextInt();
        System.out.print("Enter the exponent: ");
        power = input.nextInt();
        if(power==0){
            System.out.println("Result: "+result);
        }else {
            for (int i = 1; i <= power; i++) {
                result *= base;

            }
            System.out.println("Result: "+result);
        }
    }

    static void factorial(){
        Scanner input = new Scanner(System.in);
        int number,result=1;
        System.out.print("Enter the number: ");
        number=input.nextInt();
        for(int i=1;i<=number;i++){
            result *=i;
        }
        System.out.println("Result: " + result);

    }
    static void mod(){
        Scanner input = new Scanner(System.in);
        int number1,number2,result;
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();
        result = number1 % number2;
        System.out.println("Result: " + result);
    }
    static void circleAreaPerimeter(){
        Scanner input = new Scanner(System.in);
        double r,angle,area,perimeter,angleArea;
        float pi= 3.14F;
            System.out.print("Enter the radius: ");
            r = input.nextDouble();
            System.out.print("Enter the angle of the circle segment:");
            angle= input.nextDouble();
            area = pi * r * r;
            perimeter = 2 * pi * r;
            angleArea = ((pi * (r * r) * angle)) / 360;
        System.out.print("Result:\nWhole Area: "+area+"\n");
        System.out.print("Slice Area: "+angleArea+"\n");
        System.out.print("Perimeter: "+perimeter+"\n");
    }
    static void rectangleAreaPerimeter(){
        Scanner input = new Scanner(System.in);
        int area,perimeter;
        System.out.println("Enter the Short Side: ");
        int shortSide = input.nextInt();
        System.out.println("Enter the Long Side: ");
        int longSide = input.nextInt();
        area = shortSide * longSide;
        perimeter = 2*(shortSide + longSide);
        System.out.println("Result:\nArea: "+area);
        System.out.println("Perimeter: "+perimeter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select,start;
        String menu = "1- Addition Operation\n"
                + "2- Subtraction Operation\n"
                + "3- Multiplication Operation\n"
                + "4- Division Operation\n"
                + "5- Exponential Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Modulus Calculation\n"
                + "8- Circle Area and Perimeter Calculation\n"
                + "9- Rectangle Area and Perimeter Calculation\n"
                + "0- Exit";
        do {
            System.out.println(menu);
            System.out.print("Please Select: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    ;
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    circleAreaPerimeter();
                    break;
                case 9:
                    rectangleAreaPerimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid number,please try again!");
            }
            System.out.println("To start again, please press 1...");
            start = input.nextInt();
        }while(start==1);
    }
}