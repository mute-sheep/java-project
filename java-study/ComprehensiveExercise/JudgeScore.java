package ComprehensiveExercise;
import java.util.Random;
public class JudgeScore {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(10) + 3;
        System.out.println("一共有" + n + "位评委");
        int arr[] = new int[n];
        for(int i = 0;i < arr.length;i++){
            arr[i] = r.nextInt(100) + 1;
        }

        int max = arr[0];
        int min = arr[0];
        double num = 0;
        for(int i = 0;i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
            num += arr[i];
        }
        num = (num - max -min)/(n-2);
        System.out.println("最高分:" + max);
        System.out.println("最低分:" + min);
        System.out.println("最终得分" + num );
    }
}
