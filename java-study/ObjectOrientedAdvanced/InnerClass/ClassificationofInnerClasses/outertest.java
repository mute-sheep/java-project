public class outertest {
    public static void main(String[] args) {
        //成员内部类
        //创建对象
        outer.DefaultInner D = new outer().new DefaultInner(); //内部类的定义
        D.show();
        
        //静态内部类
        //创建对象
        outer.StaticInner S = new outer.StaticInner();
        //两种调用方法
        S.show(); //如果是静态方法，不推荐这一种调用
        outer.StaticInner.show(); //如果是静态方法，可以不用创建对象，直接调用即可
    
        //局部内部类
        outer o = new outer();
        o.show123();
        System.out.println();

        //匿名内部类（1.继承/接口，2.重写，3.创建对象）
        //new指向的是域，域才是真正的类
        //调用方式一
        Swim s = new Swim(){
            @Override 
            public void swim(){
                System.out.println("调用了匿名内部类");
                System.out.println();
            }
            };
        s.swim();

        //调用方式二
        new Swim(){
            @Override 
            public void swim(){
                System.out.println("调用了匿名内部类");
                System.out.println();
            }
            }.swim();;
    }
}