package ComprehensiveExercise;
import java.util.Random;
public class RandomNonRepeat {
    public static void main(String[] args) {
        int arr[] = {2,8,888,1000,2000};
        Random r = new Random();
        System.out.println("抢到红包的金额分别是");
        for(int i = 0;i < arr.length;i++){
            while(true){
                int n = r.nextInt(arr.length);
                if(arr[n] == 0){
                    continue;
                }
                System.out.println(arr[n]);
                arr[n] = 0;
            }
        }
    }
}
