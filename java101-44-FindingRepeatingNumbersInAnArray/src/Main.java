import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    static void print(int[] copy,int[] arr1){
        System.out.println("Your array: ");
        for(int i= 0 ; i<arr1.length;i++){
            System.out.print(arr1[i] + "  ");
        }
        System.out.print("\nRepeating Values: ");
        for(int value: copy){
            if(value!=0){
                System.out.print(value + "  ");
            }
        }
        System.out.print("\nRepeating Even Values: ");
        for(int value: copy){
            if(value!=0 && value % 2 == 0){
                System.out.print(value + "  ");
            }
        }

    }
    public static void main(String[] args) {
        int[] arr1 = {3, 0, 12, 5, 53, 61, 7, 44, 3, 5, 2,2,4,4,4, 111, 53, 22, 33, 4, 54, 5, 6, 7, 0, 0};
        int[] copy = new int[arr1.length];
        int startIndex = 0;
        for(int i = 0; i< arr1.length ; i ++ ){
            for(int j = 0 ; j<arr1.length ; j ++){
                if((i!=j)&& (arr1[i]==arr1[j])){
                    if(!isFind(copy , arr1[i])){
                        copy[startIndex] = arr1[i];
                        startIndex++;
                    }
                    break;
                }
            }
        }
        print(copy,arr1);
    }
}
