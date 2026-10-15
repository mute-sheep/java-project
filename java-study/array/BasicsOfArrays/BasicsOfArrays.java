import java.util.Scanner;
public class BasicsOfArrays{
    public static void main(String[] args) {
        //static initialization
        int[] arr1 = {1,2,3};
        int arr2[] = {4,5,6};
        //large range can contain a small range
        double[] arr3 = {1,2.1,3.1};
        double arr4[] = {4,5.1,6.1};
        String arr5[]={"zhang","li"};
        //array address
        
        System.out.println("array address:" + arr1);
        //Array traversal
        for(int i = 0;i < arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("----------------------");
        for(int i = 0;i < arr2.length;i++){
            System.out.println(arr2[i]);
        }
        System.out.println("----------------------");
        for(int i = 0;i < arr3.length;i++){
            System.out.println(arr3[i]);
        }
        System.out.println("----------------------");
        for(int i = 0;i < arr4.length;i++){
            System.out.println(arr4[i]);
        }
        System.out.println("----------------------");
        for(int i = 0;i < arr5.length;i++){
            System.out.println(arr5[i]);
        }
        //dynamic initialization
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[50];
        System.out.println("请输入数量(最大不过50)");
        int n = sc.nextInt();
        System.out.println("----------------------");
        for(int i = 0;i < n;i++){
            int number = sc.nextInt();
            arr[i] = number;
        }
        System.out.println("----------------------");
        for(int i = 0;i < n;i++){
            System.out.println(arr[i]);
        }
    }
}