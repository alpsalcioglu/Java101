import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in your array (n): ");
        int n = input.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter the " + (i + 1) + ". number: ");
            int number = input.nextInt();
            arr1[i] = number;
        }


        int[] frequency = new int[n];
        Arrays.fill(frequency, -1);

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] == arr1[j]) {
                    count++;
                    frequency[j] = 0;
                }
            }
            if (frequency[i] != 0) {
                frequency[i] = count;
            }
        }

        System.out.println("Element frequencies in the array:");
        for (int i = 0; i < n; i++) {
            if (frequency[i] != 0) {
                System.out.println("Number "arr1[i] + ",repeated " + frequency[i] + " times.");
            }
        }
    }
}
