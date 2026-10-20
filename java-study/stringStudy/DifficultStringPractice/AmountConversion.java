package stringStudy.DifficultStringPractice;
import java.util.Scanner;
public class AmountConversion {
    public static void main(String[] args) {
        char[] bigNum = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        char[] bigUnit = {'元','拾', '佰', '仟', '万'};
        char s[] = new char[8];
        for(int i = 0;i < s.length;i++){
            s[i] = '零';
        }

        int sum;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入金额");
            sum = sc.nextInt();
            if(sum <= 99999999 && sum >= 0){
                break;
            }else{
                System.out.println("输入超出范围");
            }
        }

        Conversion(sum,s,bigNum);
        String str = "";
        for(int i = 0 ;i < s.length;i++){
            if(i < 5){
            str = str + bigUnit[i] + s[i];
            }else{
                str = str + bigUnit[i-4] + s[i];
           }
        }

        String str1 = Reverse(str);
        if(str1 == null){
            System.out.println("发生错误");
        }else{
            System.out.println(str1);
        }
    }

    public static void Conversion(int sum,char[] s,char[] bigNum){
        int i = 0;
        while(sum > 0){
            int data = sum % 10;
            if(data != 0){
                s[i] = bigNum[data];
            }
            sum /= 10;
            i++;
        }
    }

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
}
