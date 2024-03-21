import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int year,mod;
    do {
        String zodiac = "";
        System.out.println("Enter your Birth Year: ");
        year = input.nextInt();
        if (year > 0) {
            mod = year % 12;
            switch (mod) {
                case 0:
                    zodiac = "Monkey";
                    break;
                case 1:
                    zodiac = "Rooster";
                    break;
                case 2:
                    zodiac = "Dog";
                    break;
                case 3:
                    zodiac = "Pig";
                    break;
                case 4:
                    zodiac = "Rat";
                    break;
                case 5:
                    zodiac = "Ox";
                    break;
                case 6:
                    zodiac = "Tiger";
                    break;
                case 7:
                    zodiac = "Rabbit";
                    break;
                case 8:
                    zodiac = "Dragon";
                    break;
                case 9:
                    zodiac = "Snake";
                    break;
                case 10:
                    zodiac = "Horse";
                    break;
                case 11:
                    zodiac = "Sheep";
                    break;
            }
            System.out.println("Your Chinese Zodiac is: " + zodiac);
        } else {
            System.out.println("Please enter a valid year.");
        }
        System.out.println("To Start Again, please press '1'...");
        int start = input.nextInt();
        if (start != 1) {
            break;
        }
    }while(true);



    }
}