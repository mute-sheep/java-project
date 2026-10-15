import java.util.Random;
import java.util.Scanner;
public class TraverseTheArrayToSum {
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

        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("-------------------------");
        int sum = 0;
        for(int i = 0 ;i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println("sum:" + sum);
        System.out.println("-------------------------");
        int avg = sum / arr.length;
        System.out.println("avg:" + avg);
        System.out.println("-------------------------");
        int count = 0;
        for(int i = 0 ;i < arr.length;i++){
            if(arr[i] < avg){
                count ++;
            }
        }
        System.out.println("count:" + count);
        
    }
}
