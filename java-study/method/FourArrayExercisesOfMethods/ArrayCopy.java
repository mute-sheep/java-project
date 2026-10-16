import java.util.Scanner;
public class ArrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int arr1[] = new int[10];
        System.out.println("请输入开始值:");
        int star = sc.nextInt();
        System.out.println("请输入结束值:");
        int end = sc.nextInt();
        ArrayCopy(arr,arr1,star,end);
        System.out.println("arr：");
        traversal(arr);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("arr1：");
        traversal(arr1,end-star);
        
    }

    public static void ArrayCopy(int arr[],int arr1[],int a,int b) {
        int j = 0;
        for(int i = a;i < b;i++){
            arr1[j] = arr[i];
            j++;
        }
    }

    public static void traversal(int arr[]) {
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void traversal(int arr[],int l) {
        for(int i = 0;i < l;i++){
            System.out.println(arr[i]);
        }
    }
}   
