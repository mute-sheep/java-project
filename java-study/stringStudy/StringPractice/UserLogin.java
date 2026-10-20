package stringStudy.StringPractice;
import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String username = "123456789";
        String password = "987654321";
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        for(int i = 0;i < 3;i++){
            System.out.println("请输入账号:");
            String user = sc.next();
            System.out.println("请输入密码:");
            String pass = sc.next();
            if(user.equals(username) && pass.equals(password)){
                System.out.println("登录成功");
                b = false;
                break;
            }else{
                System.out.println("登录失败");
            }
        }
            if(b){
                System.out.println("由于你输入错误太多了，给你封了");
            }    1
    }        
}
