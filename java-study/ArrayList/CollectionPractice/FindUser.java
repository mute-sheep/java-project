package ArrayList.CollectionPractice;
import java.util.ArrayList;
import java.util.Scanner;
public class FindUser {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in); 
        User u1 = new User("2024","小小","123456");
        User u2 = new User("2025","小宝","1234567");
        User u3 = new User("2026","大宝","12345678");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        System.out.println("请输入你要查找的id");
        String id = sc.next();
        Find(list,id);
    }

    public static void Find(ArrayList<User> list,String id){
        for(int i = 0;i < list.size();i++){
            if(list.get(i).getId().equals(id)){
                System.out.println("成功找到");
                System.out.println("学号:" + list.get(i).getId());
                System.out.println("姓名:" + list.get(i).getUsername());
                System.out.println("密码:" + list.get(i).getPassword());
                return;
            }
        }
        System.out.println("查找失败，用户不存在");
        return;
    }
}
