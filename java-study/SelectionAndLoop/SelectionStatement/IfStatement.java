import java.util.Scanner;
public class IfStatement {
    //single branch
    public static void main(String[] args){
        System.out.println("------single branch------");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        if(number1 > 10){
            System.out.println("太大了");
        }
        //double branch 
        System.out.println("------double branch------");
        int number2 = sc.nextInt();
        if(number2 > 10){
            System.out.println("还是太大了");
        }else{
            System.out.println("小了");
        }
        //multi-branch
        System.out.println("------double branch------");
        int number3 = sc.nextInt();
        if(number3 > 10){
            System.out.println("还是太大了");
        }else if(number3 <= 10 && number3 >=5){
            System.out.println("刚刚好");
        }else{
            System.out.println("还是小了");
        }
    }
}