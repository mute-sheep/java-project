import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int number = r.nextInt(100);
        System.out.println("答案" + number);
        int start = 0;
        int end = 100;
        while(true){
            System.out.println("请输入" + start + "-" + end + "的数字");
            int i = sc.nextInt();
            while(true){
                if(i >= start && i <= end)
                    break;
                else{
                    System.out.println("输入有误");
                    i = sc.nextInt();
                    }
                }
            if(i < number)
                start = i;
            else if (i > number)
                end = i;
            else if(i == number){
                System.out.println("恭喜你猜对了");
                break;
                }
        }   
    }
}
