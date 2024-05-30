import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Row Number: ");
        int row = input.nextInt();
        System.out.print("Enter the Column Number: ");
        int column = input.nextInt();
        int[][] arr = new int[row][column];

        System.out.print("Enter the elements from left to right: ");
        for(int i=0; i<row ; i++){
            for(int j = 0; j<column ; j++){
                arr[i][j] = input.nextInt();
            }
        }
        int[][] transpose = new int[column][row];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println("Original Matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix: ");
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.print(transpose[i][j] +" ");
            }
            System.out.println();
        }




    }
}
