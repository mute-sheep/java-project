import java.util.Scanner;
public class FindIdenticalElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        if(Find(arr)){
            System.out.println("存在");
        }else{
            System.out.println("不存在");
        }
    }
    public static boolean Find(int arr[]) {
        System.out.println("请输入要查找的数字:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 0 ;i < arr.length;i++){
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }  
}
