public class test {
    public static void main(String[] args) {
        ma m = new ma();
        System.out.println(inter.a);
        // inter.a = 10; 报错了
        m.mathon();
    }    
}

// 接口中成员的特点
// 成员变量
// 接口没有构造方法成员方法只能是抽象方法
//   只能是常量
//   默认修饰符:public static final
// 构造方法
//   没有
// 成员方法
//   只能是抽象方法
// 默认修饰符:public abstractJDK7以前:接口中只能定义抽象方法。
