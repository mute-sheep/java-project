import java.util.Scanner;

public class ArithmeticOperator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数值");
        int number1 = sc.nextInt();

        System.out.println("请输入第二个数值");
        int number2 = sc.nextInt();

        int plus = number1 + number2;
        int minus = number1 - number2;
        int multiply = number1 * number2;
        int divide = number1 / number2;
        int modulus = number1 % number2;

        System.out.println("result of the operation:");
        System.out.println("plus:" + plus);
        System.out.println("minus:" + minus);
        System.out.println("multiply:" + multiply);
        System.out.println("divide:" + divide);
        System.out.println("modulus:" + modulus);

        System.out.println("请输入一个三位数");
        int number3 = sc.nextInt();
        int ge = number3 % 10;
        int shi = number3 / 10 % 10;
        int bai = number3 / 100 % 10;

        System.out.println("个位数是:" + ge + "\t" + "十位数是:" + shi + "\t" + "百位数是:" + bai);
        sc.close();
    }
}
