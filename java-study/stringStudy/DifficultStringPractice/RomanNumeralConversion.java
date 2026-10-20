package stringStudy.DifficultStringPractice;
import java.util.Scanner;
public class RomanNumeralConversion {
    public static void main(String[] args){
        String s = Create();
        String s1 = Conversion(s);
        System.out.println(s1);
    }

    public static String Create(){
        Scanner sc = new Scanner(System.in);
        String s;
        while(true){
            System.out.println("输入一个字符串");
            s = sc.next();
            if(s.length() > 9){
                System.out.println("超出范围");
                continue;
            }
            boolean b = false;
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                    System.out.println("输入非法");
                    b = true;
                    break;
                }
            }
            if(b){
                continue;
            }
            break;
        }
        return s;
    }

    public static String Conversion(String s) {
        String[] roman = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            sb.append(roman[s.charAt(i) - 48]);
        }
        return sb.toString();
    }
}
