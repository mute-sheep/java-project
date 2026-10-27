package ArrayList.CollectionPractice;
import java.util.Scanner;
import java.util.ArrayList;
public class AddStudentObject {
    public static void main(String[] args) {
        ArrayList<Study> list = new ArrayList<>();
        int n = 1;
        Scanner sc = new Scanner(System.in); 
        while(true){
            Study s = new Study();
            System.out.printf("请输入第%d的学生信息\n",n);
            System.out.println("姓名:");
            String name = sc.next();
            s.setName(name);
            System.out.println("年龄:");
            int age = sc.nextInt();
            s.setAge(age);
            list.add(s);
            System.out.println("输入1继续添加，其他皆为退出");
            int j = sc.nextInt();
            if(j != 1){
                break;
            }
            n++;
        }

    for(int i = 0;i < list.size();i++){
        System.out.printf("---第%d位学生信息---\n",i + 1);
        System.out.println("姓名:" + list.get(i).getName());
        System.out.println("年龄:" + list.get(i).getAge());
        System.out.println();
    }
    }
}
