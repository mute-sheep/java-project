import java.util.Scanner;
public class DefinitionOfAMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("无参无返回值");
        method1();

        System.out.println("有参无返回值");
        System.out.println("请输入两个整数");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        method2(number1,number2);

        System.out.println("有参有返回值");
        System.out.println(method3(2));
    }
    public static void method1(){
        System.out.println("hello word");
    }
    public static void method2(int a,int b) {
        int num = a + b;
        System.out.println("a + b: " + num);
    }
    public static int method3(int a) {
        return a*2;
    }
}
