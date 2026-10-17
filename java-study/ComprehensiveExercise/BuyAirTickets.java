package ComprehensiveExercise;

import java.util.Random;

public class BuyAirTickets {
    public static void main(String[] args){
        AirFare();
    }

    public static boolean Judge(){
        Random r = new Random();
        int n = r.nextInt(12) + 1;
        boolean j;
        if(n >= 5 && n <= 10){
            System.out.println("现在是" + n + " 月(旺季)");
            j = true; 
        }else{
            System.out.println("现在是" + n + " 月(淡季)");
            j = false;
        }
        return j;
    }

    public static void show(double[] arr, String[] arrString){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arrString[i] + arr[i] + "     ");
        }
        System.out.println(); 
    }

    public static void AirFare(){
        double arr[] = new double[2];
        String arrString[] = {"经济舱:","头等舱:"};
        Random r = new Random();
        arr[0] = r.nextInt(100) + 50; 

        while(true){
            arr[1] = r.nextInt(300) + 50;
            if(arr[1] > arr[0]){
                break;
            }
        }

        System.out.print("原价:  ");
        show(arr,arrString);

        boolean b = Judge();
        if(b){
            arr[0] *= 0.85;
            arr[1] *= 0.9;
        }else{
            arr[0] *= 0.65;
            arr[1] *= 0.7;
        }
        System.out.print("打折后:  ");
        show(arr,arrString);
    }
}
