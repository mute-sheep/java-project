import java.util.Random;
public class FindMaxAndMin {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int [5];
        for(int i = 0 ;i < arr.length;i++){
            int number = r.nextInt(99);
            arr[i] = number;
        }
        System.out.println("随机出来的数组");
        for(int i = 0;i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        int max = arr[0];
        int min = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        for(int i = 0;i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        for(int i = 0;i < arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("max:" + max);
        System.out.println("min:" + min);
    }    
}
