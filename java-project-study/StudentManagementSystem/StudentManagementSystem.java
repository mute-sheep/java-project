import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class StudentManagementSystem{
    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();
        ArrayList<Study> study = new ArrayList<>();
        boolean b = Login(user);
        if(b){
            StudyLogin(study);
        }
    }
    public static void StudyLogin(ArrayList<Study> study) {
        Scanner sc = new Scanner(System.in);
        a:while(true){
            System.out.println("-----Study Login Menu-----");
            System.out.println("1.添加学生");
            System.out.println("2.查看学生");
            System.out.println("3.删除学生");
            System.out.println("4.修改学生");
            System.out.println("0.退出");
            int choose = sc.nextInt();
            sc.nextLine();
            switch(choose){
                case 0:
                    break a;
                case 1:
                    addStudy(study, sc);
                    break;
                case 2:
                    show(study);
                    break;
                case 3:
                    delStudy(study, sc);
                    break;
                case 4:
                    changeStudy(study, sc);
                    break;
                default:
                    System.out.println("此数字暂无功能");
            }
        }
    }
    //添加学生信息
    public static void addStudy(ArrayList<Study> study,Scanner sc) {
        while (true) {
            System.out.println("请输入学号");
            String s1 = IdStudy(study,sc);
            System.out.println("请输入名字");
            String s2 = sc.next();
            System.out.println("请输入年龄");
            int n = sc.nextInt();
            String s3 = GenderStudy(sc);
            Study stu = new Study(s1, s2, n, s3);
            study.add(stu);
            System.out.println("如果想要继续录入学生信息,输入1");
            int p = sc.nextInt();
            if(p != 1){
                break;
            }
        }
    }
    //展示学生信息
    public static void show(ArrayList<Study> study) {
        if(study.size() == 0){
            System.out.println("没有学生信息");
            return;
        }

        for(int i = 0;i < study.size();i++){
            Study s = study.get(i);
            System.out.println("学号:" + s.getId()+ "   姓名:" + s.getName() + "   年龄:" + s.getAge() + "   性别:" + s.getGender());
        }
    }

    //删除学生
    public static void delStudy(ArrayList<Study> study,Scanner sc) {
        if(study.size() == 0){
            System.out.println("没有学生");
            return;
        }
        System.out.println("请输入你要查找学生的学号");
        String id = sc.next();
        Study b = StudyLive(study,id);
        if(b != null){
            study.remove(b);
            System.out.println("删除成功");
        }
    }
    //修改学生
    public static void changeStudy(ArrayList<Study> study,Scanner sc) {
        if(study.size() == 0){
            System.out.println("没有学生");
            return;
        }
        System.out.println("请输入你要查找学生的学号");
        String id = sc.next();
        Study b = StudyLive(study,id);
        if(b != null){
            //学号
            System.out.println("是否修改学号（1是，其他否）");
            int n = sc.nextInt();
            if(n == 1){
                String s = IdStudy(study,sc);
                b.setId(s);
            }
            //名字
            System.out.println("是否修改名字（1是，其他否）");
            n = sc.nextInt();
            if(n == 1){
                String s = sc.next();
                b.setName(s);
            }
            //年龄
            System.out.println("是否修改年龄（1是，其他否）");
            n = sc.nextInt();
            if(n == 1){
                int  s = sc.nextInt();
                b.setAge(s);
            }
            //性别
            System.out.println("是否修改性别（1是，其他否）");
            n = sc.nextInt();
            if(n == 1){
                String s = GenderStudy(sc);
                b.setGender(s);
            }
            System.out.println("修改完成");
        }
    }

    //判断学生是否存在
    public static Study StudyLive(ArrayList<Study> study,String id) {
        if(study.size() == 0){
            System.out.println("没有学生");
            return null;
        }
        for(int i = 0;i < study.size();i++){
            if(study.get(i).getId().equals(id)){
                return study.get(i);
            }
        }
        System.out.println("学生不存在");
        return null;
    }

    //获取学生学号
    public static String IdStudy(ArrayList<Study> study,Scanner sc){
        a:while(true){
            System.out.println("请输入学号");
            String s = sc.next();
            // 判断长度
            if(s.length() != 10){
                System.out.println("学号长度必须为10");
                continue;
            }
            // 判断内容
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) < '0' ||s.charAt(i) > '9'){
                    System.out.println("学号必须是纯数字");
                    continue a;
                }
            }
            // 判断唯一
            for(int i = 0;i < study.size();i++){
                if(study.get(i).getId().equals(s)){
                    System.out.println("学号重复");
                    continue a;
                }
            }
            return s;
        }
    }
    
    //获取学生性别
    public static String GenderStudy(Scanner sc) {
        while(true) {
            System.out.println("请选择性别");
            System.out.println("0.女");
            System.out.println("1.男");
            int i = sc.nextInt();
            if(i == 0){
                return "女";
            }else if(i == 1){
                return "男";
            }else{
                System.out.println("请输入合法数字");
            }
        }
    }
    
    //登录菜单
    public static boolean Login(ArrayList<User> user){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("-----Login Menu-----");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.忘记密码");
            System.out.println("0.退出");
            int choose = sc.nextInt();
            sc.nextLine();
            switch(choose){
                case 0:
                    return false;
                case 1:
                    boolean b = Login_fun1(user, sc);
                    if(b){
                        return true;
                    }
                    break;
                case 2:
                    Login_fun2(user, sc);
                    break;
                case 3:
                    Login_fun3(user, sc);
                    break;
                default:
                    System.out.println("此数字暂无功能");
            }
        }
    }
    
    //登录
    public static boolean Login_fun1(ArrayList<User> user, Scanner sc) {
        int n = 0;
        a:while(true){
            if(n == 5){
                System.out.println("密码错误次数过多，已锁定");
                return false;
            }
            System.out.print("账号:");
            String username = sc.next();
            User findUser = null;
            for(int i = 0;i < user.size();i++){
                User s = user.get(i);
                if(s.getUsername().equals(username)){
                    findUser = s;
                    break;
                }
            }
            if(findUser == null){
                System.out.println("用户不存在,请先注册");
                return false;
            }
            System.out.print("密码:");
            String password = sc.next();
            if(findUser.getPassword().equals(password)){
                VerificationCode(sc);
                return true;
            }
            System.out.println("密码输入有误");
            n++;
        }
    }
    
    //注册
    public static void Login_fun2(ArrayList<User> user, Scanner sc){
        String username = UsernameJudgment(user, sc);
        String password = PasswordJudgment(sc);
        String Id = IdCardJudgment(sc);
        String Phone = PhoneNumberJudgment(sc);
        User u = new User(username,password,Id,Phone);
        VerificationCode(sc);
        user.add(u);
        System.out.println("注册成功！");
    }
    
    //忘记密码
    public static void Login_fun3(ArrayList<User> users, Scanner sc) {
        if(users.size() == 0){
            System.out.println("暂无用户，请先注册");
            return;
        }

        User u = null;
        a:while(true) {
            System.out.println("请输入用户名:");
            String s = sc.next();
            for(int i = 0;i < users.size();i++){
                if(users.get(i).getUsername().equals(s)){
                    u = users.get(i);
                    break a;
                }
            }
            System.out.println("不存在这个账户，请重新输入！");
        }
        while(true) {
            String phone = PhoneNumberJudgment(sc);
            if(u.getPhoneNumber().equals(phone)){
                break;
            }else{
                System.out.println("电话号码错误");
            }
        }
        System.out.println("请输入新密码");
        String newPwd = PasswordJudgment(sc);
        VerificationCode(sc);
        u.setPassword(newPwd);
        System.out.println("密码修改成功");
    }

    // 验证验证码
    public static void VerificationCode(Scanner sc) {
        Random r = new Random();
        while(true){
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < 4;i++){
                int n;
                if(i < 3){
                    while(true){
                        n = r.nextInt(58) + 65;
                        if(n > 90 && n < 96){
                            continue;
                        }
                        sb.append((char)n);
                        break;
                    }
                }else{
                    n = r.nextInt(10);
                    sb.append(n);
                }
            }
            System.out.println("请输入验证码【" + sb.toString() + "】:");
            String s = sc.next();
            if(s.equals(sb.toString())){
                System.out.println("验证成功");
                break;
            }
            System.out.println("验证码错误");
        }
    }

    // 注册时的用户名判断
    public static String UsernameJudgment(ArrayList<User> user, Scanner sc) {
        a:while(true){
            System.out.print("username:");
            String username = sc.next();
            if(username.length() < 3 || username.length() > 15){
                System.out.println("用户名长度必须3~15位");
                continue a;
            }
            int big = 0;
            for(int i = 0;i < username.length();i++){
                char c = username.charAt(i);
                if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                    continue;
                }else if(c >= '0' && c <= '9'){
                    big ++;
                    continue;
                }
                System.out.println("用户名非法，只能字母+数字");
                continue a;
            }
            //修复原来的bug：不能纯数字
            if(big == username.length()){
                System.out.println("用户名不能全部是数字");
                continue a;
            }

            for(int i = 0;i < user.size();i++){
                if(user.get(i).getUsername().equals(username)){
                    System.out.println("用户名已存在");
                    continue a;
                }
            }
            return username;
        }
    }

    // 注册时的密码判断
    public static String PasswordJudgment(Scanner sc) {
        a:while(true){
            System.out.println("请输入密码");
            String s = sc.next();
            if(s.length() < 6 || s.length() > 18){
                System.out.println("密码长度6~18位");
                continue a;
            }
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            for(int i = 0;i < s.length();i++){
                char c = s.charAt(i);
                if(c >= 'A' && c <= 'Z'){
                    count1++;
                }else if(c >= 'a' && c <= 'z'){
                    count2++;
                }else if(c >= '0' && c <= '9'){
                    count3++;
                }else{
                    System.out.println("密码只能包含大写字母，小写字母和数字");
                    continue a;
                }
            }
            if(count1 == 0 || count2 == 0 || count3 == 0){
                System.out.println("密码必须同时包含大写字母、小写字母和数字");
                continue a;
            }
            while(true){
                System.out.println("请再次确定密码:");
                String s1 = sc.next();
                if(s.equals(s1)){
                    break;
                }
                System.out.println("两次密码不一样");
            }
            return s;
        }
    }

    //注册时的身份证判断
    public static String IdCardJudgment(Scanner sc) {
        a:while(true){
            System.out.println("请输入你的身份证");
            String s = sc.next();
            if(s.length() != 18){
                System.out.println("身份证长度必须18位");
                continue a;
            }
            for(int i = 0;i < s.length();i++){
                if(i < s.length() -1){
                    char c = s.charAt(i);
                    if(c < '0' || c > '9'){
                        System.out.println("身份证前17位必须是数字");
                        continue a;
                    }
                    if(i == 0 && c == '0'){
                        System.out.println("身份证首位不能为0");
                        continue a;
                    }
                }else{
                    char last = s.charAt(i);
                    if(last != 'X' && last != 'x' && (last < '0' || last > '9')){
                        System.out.println("身份证最后一位只能是数字或X/x");
                        continue a;
                    }
                }
            }
            return s;
        }
    }

    //注册时的手机号判断
    public static String PhoneNumberJudgment(Scanner sc) {
        a:while(true){
            System.out.println("请输入手机号");
            String s = sc.next();
            if(s.length() != 11){
                System.out.println("手机号长度必须11位");
                continue a;
            }
            for(int i = 0;i < s.length();i++){
                char c = s.charAt(i);
                if(c < '0' || c > '9'){
                    System.out.println("电话号码必须是纯数字");
                    continue a;
                }
                if(i == 0 && c == '0'){
                    System.out.println("手机号开头不能为0");
                    continue a;
                }
            }
            return s;
        }
    }
}
