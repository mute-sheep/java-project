import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Random r = new Random();
        //static initialization
        int[][] arr1 = {{1,2,3},{4,5,6}};
        //dynamic initialization
        int arr2[][] = new int[2][2];
        for(int i = 0;i < arr2.length;i++){
            for(int j = 0;j < arr2[i].length;j++){
                arr2[i][j] = r.nextInt(100);
            }
        }
        System.out.println("arr1:");
        show(arr1);
        System.out.println("------------------------------------");
        System.out.println("arr2:");
        show(arr2);
    }

    public static void show(int arr[][]) {
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
