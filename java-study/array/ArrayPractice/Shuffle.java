import java.util.Random;
import java.util.Scanner;
public class Shuffle {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据个数");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ;i < arr.length;i++){
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }
        System.out.println("-----打乱前----");
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int i = 0;i < arr.length-1;i++){
            int j = r.nextInt(n);
            if(j == i){
                continue;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        System.out.println("-----打乱后----");
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
