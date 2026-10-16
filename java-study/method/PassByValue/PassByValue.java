public class PassByValue{
    public static void main(String[] args){
        int number = 100;
        int arr[] = {number};
        change1(number);
        change2(arr);
        System.out.println("值传递:" + number);
        System.out.println("引用传递:" + arr[0]);
        
    }

    public static void change1(int number){
        number = 200;
    }

    public static void change2(int[] arr){
        arr[0] = 200;
    } 
}

