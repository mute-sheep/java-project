package stringStudy.StringComparison;
import java.util.Scanner;
public class StringComparison {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1 = sc.next();  //键盘录入是new出来的
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println("==比较");
        System.out.println("s1是键盘输入,s2是串池,s3是堆");
        System.out.println("s1 和 s2:");
        System.out.println(s1 == s2);
        System.out.println("s2 和 s3:");
        System.out.println(s2 == s3);
        System.out.println("s1 和 s3:");
        System.out.println(s1 == s3);
        System.out.println("equals是比较内容，但是区分大小写");
        System.out.println(s1.equals(s3));
        System.out.println("equalsIgnoreCase也是比价内容，但是不区分大小写");        
        System.out.println(s1.equalsIgnoreCase("ABC"));
    }
}
