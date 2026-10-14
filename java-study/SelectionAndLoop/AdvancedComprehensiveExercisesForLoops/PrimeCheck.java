import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int flag = 1;
        for(int i = 2;i <= number / 2;i++){
            if(number % i == 0){
                flag = 0;
                break;
            }
        }
        if(flag == 1)
            System.out.println(number + "是质数");
        else
            System.out.println(number + "不是质数");
    }
}
