package ObjectOriented.ObjectOrientedComprehensivePractice.ObjectArrayFive;
import java.util.Scanner;
public class StudyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Study st[] = new Study[3];
        while(true){
            System.out.println("---菜单---");
            System.out.println("1.添加学生");
            System.out.println("2.查看学生");
            System.out.println("3.删除学生");
            System.out.println("4.查找学生");
            System.out.println("其他数字皆为退出");
            int oppoise = sc.nextInt();
            if(oppoise == 1){
                while(true){
                    int count = CountPeople(st);
                    if(count == st.length){
                        st = CreateArray(st);
                    }
                    int i = count + 1;
                    System.out.println("请输入第"+ i + "位的学生信息");
                    System.out.println("学号:");
                    System.out.println("(学号输入负数则停止输入)");
                    int id = sc.nextInt();
                    if(id < 0){
                        break;
                    }
                    while(JudgeDuplicate(st, id)){
                        System.out.println("Id重复，请重新输入");
                        id = sc.nextInt();
                    }
                    System.out.println("姓名：");
                    String name = sc.next();
                    System.out.println("年龄");
                    int age = sc.nextInt();
                    Study s = new Study(id, name, age);
                    st[count] = s;
                }
            }else if(oppoise == 2){
                show(st);
            }else if(oppoise == 3){
                System.out.println("请输入你要删除的学生的学号");
                int id = sc.nextInt();
                if(JudgeDuplicate(st,id)){
                    int n = FindStudy(st, id);
                    System.out.println("学号：" + st[n].getId() + " 已删除");
                    st[n] = null;
                    show(st);
                }else{
                    System.out.println("不存在这个学生");
                }
            }else if(oppoise == 4){
                System.out.println("请输入你要查找的学生的学号");
                int id = sc.nextInt();
                int i = FindStudy(st, id);
                if(i == -1){
                    System.out.println("该学生不存在");
                }else{
                    System.out.println("学号:" + st[i].getId() + "  姓名:" + st[i].getName() + "  年龄:" + st[i].getAge());
                }
            }else{
                System.out.println("程序退出");
                break;
            }
        }
        sc.close();
    }

    public static Study[] CreateArray(Study st[]){
        Study stu[] = new Study[st.length + 1];
        for(int i = 0;i < st.length;i++){
            stu[i] = st[i];
        }
        return stu;
    }

    public static int CountPeople(Study st[]){
        int count = 0;
        for(int i = 0;i < st.length;i++){
            if(st[i] == null){
                continue;
            }
            count ++;
        }
        return count;
    }

    public static boolean JudgeDuplicate(Study[] st,int id){
        for(int i = 0;i < st.length;i++){
            if(st[i] != null && st[i].getId() == id){
                return true;
            }
        }
        return false;
    }

    public static void show(Study st[]){
        boolean hasData = false;
        for(int i = 0;i < st.length;i++){
            if(st[i] == null)
                continue;
            hasData = true;
            System.out.println("学号:" + st[i].getId() + "  姓名:" + st[i].getName() + "  年龄:" + st[i].getAge());
        }
        if(!hasData){
            System.out.println("暂无学生信息");
        }
    }

    //根据学号查找，返回下标，找不到返回-1
    public static int FindStudy(Study st[],int id){
        for(int i = 0;i < st.length;i++){
            if(st[i] != null && st[i].getId() == id){
                return i;
            }
        }
        return -1;
    }
}
