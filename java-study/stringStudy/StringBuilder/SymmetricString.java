package stringStudy.StringBuilder;
import java.util.Scanner;
public class SymmetricString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串:");
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        if(sb.toString().equals(sb.reverse().toString())){
            System.out.println("是");
        }else{
            System.out.println("不是");
        }

    }
}
