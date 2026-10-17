package ComprehensiveExercise;
import java.util.Scanner;
import java.util.Random;
public class DoubleColorBall {
    public static void main(String[] args) {
        int red[] = new int[6];
        int blue = WinningNumber(red);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入红色球：");
        int arr[] = new int [red.length];
        for(int i = 0;i < arr.length;i++){
            int n = i + 1;
            System.out.println("第"+ n +"球号码:");
            arr[i] = sc.nextInt();
        }
        System.out.println("请输入蓝色球：");
        int blue1 = sc.nextInt();
        int sum = Judge(red,blue,arr,blue1);
        if(sum == 0){
            System.out.println("笑死我了，你个倒霉蛋");
        }else{
            System.out.println("总金额:" + sum);
        }

    }


    public static int WinningNumber(int arr[]) {
        Random r = new Random();
        for(int i = 0;i < arr.length;i++){
            arr[i] = r.nextInt(36) + 1;
        }
        return r.nextInt(16) + 1;
    }

    public static int Judge(int red[],int blue,int arr[],int blue1){
        int count = 0;
        for(int i = 0;i < red.length;i++){
            if(arr[i] == red[i]){
                count++;
            }
        }
        int sum = 0;
        if(count == 6 && blue == blue1){
            System.out.println("恭喜你获得一等奖");
            sum = 10000000;
        }else if((count == 5 && blue != blue1) || (count == 4 && blue == blue1)){
            System.out.println("恭喜你获得二等奖");
            sum = 5000000;
        }else if((count == 4 && blue != blue1) || (count == 3 && blue == blue1)){
            System.out.println("恭喜你获得三等奖");
            sum = 3000;
        }else if((count == 3 && blue != blue1) || (count == 2 && blue == blue1)){
            System.out.println("恭喜你获得四等奖");
            sum = 200;
        }else if((count == 2 && blue != blue1) || (count == 1 && blue == blue1)){
            System.out.println("恭喜你获得五等奖");
            sum = 10;
        }else if((count == 1 && blue != blue1) || (count == 0 && blue == blue1)){
            System.out.println("恭喜你获得六等奖");
            sum = 5;
        }
        return sum;
    }

}