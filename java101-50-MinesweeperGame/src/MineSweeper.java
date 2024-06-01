import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    static void makeArr(){

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Your array-> AxA\nEnter the A number: ");
        int arrNum = input.nextInt();
        String[][] arr1 = new String[arrNum][arrNum];

        int rows = arr1.length;
        int cols = arr1[0].length;
        int numberOfAsterisks = (arrNum*arrNum)/4;
        for (int i = 0; i < arrNum; i++) {
            for (int j = 0; j < arrNum; j++) {
                arr1[i][j] = "-";
            }
        }
        String[][] arr2 = new String[rows][cols];
        for (int i = 0; i < arrNum; i++) {
            for (int j = 0; j < arrNum; j++) {
                arr2[i][j] = arr1[i][j];
            }
        }

        for(int i=0;i<numberOfAsterisks;i++){
            int randomRow = rand.nextInt(rows);
            int randomCols= rand.nextInt(cols);
            arr1[randomRow][randomCols] = "*";
        }

        boolean gameContinues = true;
        int safeCellsToReveal = (arrNum * arrNum) - numberOfAsterisks;
        while(gameContinues){
            printArr(arr2);
            System.out.print("Enter a Row Number, Then a Column Number:\n--> ");
            int userRow = input.nextInt();
            int userColumn = input.nextInt();
            if (userRow < 0 || userRow >= arrNum || userColumn < 0 || userColumn >= arrNum) {
                System.out.println("Invalid input! Please enter valid row and column numbers.");
                continue;
            }if (arr1[userRow][userColumn].equals("*")) {
                System.out.println("Game Over! You hit a mine.");
                gameContinues = false;
                revealMines(arr2, arr1);
                printArr(arr2);
            } else {
                int mineCount = countMines(arr1, userRow, userColumn);
                arr2[userRow][userColumn] = String.valueOf(mineCount);
                safeCellsToReveal--;
                if (safeCellsToReveal == 0) {
                    System.out.println("Congratulations! You've revealed all safe cells.");
                    gameContinues = false;
                    printArr(arr2);
                }
            }
        }

    }
    static void printArr(String[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void revealMines(String[][] arr2, String[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j].equals("*")) {
                    arr2[i][j] = "*";
                }
            }
        }
    }

    static int countMines(String[][] arr, int row, int col) {
        int mineCount = 0;
        int[] dRow = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dCol = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int k = 0; k < 8; k++) {
            int newRow = row + dRow[k];
            int newCol = col + dCol[k];

            if (newRow >= 0 && newRow < arr.length && newCol >= 0 && newCol < arr[0].length && arr[newRow][newCol].equals("*")) {
                mineCount++;
            }
        }
        return mineCount;
    }


}
