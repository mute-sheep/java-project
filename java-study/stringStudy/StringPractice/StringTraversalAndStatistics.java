package stringStudy.StringPractice;
import java.util.Scanner;
public class StringTraversalAndStatistics {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串(只包含大写字母，小写字母和数字字符):");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int countUppercase = 0;
        int countLowercase  = 0;
        int countNumber = 0;
        boolean b = true;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
                countNumber++;
            }else if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                countUppercase++;
            }else if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                countLowercase++;
            }else{
                System.out.println("输入非法");
                b = false;
                break;
            }
        }
        if(b){
            System.out.println("大写字母:" + countUppercase + "个");
            System.out.println("小写字母:" + countLowercase + "个");
            System.out.println("数字字符:" + countNumber + "个");
        }
    }
}
