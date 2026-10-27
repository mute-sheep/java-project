public class StaticVariable {
    public static void main(String[] args) {
        study.teacher = "晓晓老师";
        study stu1 = new study(1,"小宝");
        study stu2 = new study(2,"大宝");
        study s[] = {stu1,stu2};
        for(int i = 0;i < s.length;i++){
            System.out.println("学号:" + s[i].getId() + "姓名:" + s[i].getName() + "老师:" + s[i].teacher);
            System.out.println();
        }
    }
}