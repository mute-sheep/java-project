import java.util.Scanner;
public class SkipSeven {
    public static void main(String[] args){
        System.out.println("请输入一个范围:");
        System.out.println("start:");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("end:");
        int end = sc.nextInt();
        for(int i = start;i < end;i++){
            if(i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }    
}
