public class outer{
    private int a = 10;
    static int b = 10;
    //成员内部类
    public class DefaultInner{
        private int a = 20;
        public void show(){
            int a = 30;
            System.out.println("默认内部类被调用");
            System.out.println("默认内部类方法中的局部变量a:" + a);  //调用的是最近的30,a = 30
            System.out.println("默认内部类成员变量a:" + this.a); //调用的对象，也就是inner,a = 20
            System.out.println("外部类的成员变量a:" + outer.this.a); //这里调用的是outer,a = 10
            System.out.println();
        }
    }

    //静态内部类
    public static class StaticInner{
        static int b = 20;
        public static void show(){
            System.out.println("静态内部类被调用");
            System.out.println("这里调用的是静态内部类的局部变量b:" + b);  //调用的是最近的30,b = 20
            System.out.println("这里调用的是外部类的静态成员变量b:" + outer.b); //这里调用的是outer,b = 10
            System.out.println();
        }
    }

    //局部内部类
    public void show123(){
        int c = 10;  // 局部内部类,同理，方法的局部变量可以传给局部内部类。局部内部类的方法不能传给我方法
        int tempC = c;
        class LocalInnerClass{  //局部内部类不能用 public /private/protected 修饰！只能写 abstract 或者 final，或者什么修饰符都不写
            int c = 20;
            public void show(){
                int c = 30;
                System.out.println("局部内部类被调用");
                System.out.println("局部内部类方法中的局部变量c:" + c);
                System.out.println("局部内部类成员变量c:" + this.c);
                System.out.println("方法中的局部变量c：" + tempC);
            }
        }
        //要调用局部内部类需要在方法里创建对象
        LocalInnerClass L = new LocalInnerClass();
        L.show();
    }
}