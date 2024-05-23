public class Main {
    public static void main(String[] args) {
        int[] list = {56,34,22,67,-1,3,-10,232,-123,92};
        int min = list[0];
        int max = list[1];

        for(int i:list){
            if(i<min){
                min = i ;
            }
            if(i>max){
                max = i ;
            }
        }
        System.out.println("Array:");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Max Value: " +max);
        System.out.println("Min Value: " +min);
    }
}