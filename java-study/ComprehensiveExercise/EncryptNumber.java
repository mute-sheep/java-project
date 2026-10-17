package ComprehensiveExercise;
import java.util.Random;
public class EncryptNumber {
    public static void main(String[] args){
        Encrypt(GenerateArray());
    }   

    public static void show(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    public static int[] GenerateArray() {
        Random r =  new Random();
        int arr[] = new int[4];
        for(int i = 0;i < arr.length;i++){
            arr[i] = r.nextInt(10);
        }
        System.out.println("原来的数字");
        show(arr);
        return arr;
    }

    public static void Encrypt(int arr[]){
        for(int i = 0;i < arr.length;i++){
            arr[i] = (arr[i] + 5) % 10;
        }
        System.out.println("修改后的数字");
        show(arr);
        int arr1[] = new int[arr.length];
        int j = arr.length - 1 ;
            for(int i = 0;i < arr.length;i++){
                arr1[i] = arr[j];
                j--;
        }
        System.out.println("加密后的数字");
        show(arr1);
    }
}


