import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 1;i < number;i++){
            if(i * i < number && (i + 1) * (i + 1) > number){
                System.out.println(number + "的平方根整数部分是:" + i);
                break;
            }
        }
    }
}
