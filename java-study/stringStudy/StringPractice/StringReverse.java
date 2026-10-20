package stringStudy.StringPractice;
import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.next();
        String s1 = Reverse(s);
        String s2 = reverse(s);
        if(s1 != null){
            System.out.println("s1反转之后的数值是：" + s1);
            System.out.println("s2反转之后的数值是：" + s2);
        }else{
            System.out.println("输入有误");
        }
    }

    //First Method
    public static String Reverse(String s){
        if(s == null){
            return null;
        }
        if(s.length() == 0){
            return null;
        }
        if(s.length() == 1){
            return s;
        }
        char s1[] = new char[s.length()];
        int l = s.length() - 1;
        for(int i = 0;i < s.length();i++){
            s1[i] = s.charAt(l);
            l--;
        }
        String s2 = new String(s1);
        return s2;
    }

    // Second Method
    public static String reverse(String str){
    if(str == null || str.length() == 0){
        return str;
    }
    String res = "";
    for(int i = str.length()-1; i >= 0; i--){
        res += str.charAt(i);
    }
    return res;
}

}
