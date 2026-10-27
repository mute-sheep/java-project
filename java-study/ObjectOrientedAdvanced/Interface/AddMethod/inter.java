package ObjectOrientedAdvanced.Interface.AddMethod;
// 1.JDK7以前:接口中只能定义抽象方法。
// 2.JDK8:接口中可以定义有方法体的方法。(默认、静态)
// 3.JDK9:接口中可以定义私有方法。
// 4.私有方法分为两种:普通的私有方法，静态的私有方法
public interface inter {
    //抽象方法
    public abstract void show1();
    //有方法体的方法
    //默认,可以不用重写
    public default void show2(){
        System.out.println("默认的可以定义方法体的方法");
        show4();
    }
    //静态，不能重写
    public static void show3(){
        System.out.println("静态的可以定义方法体的方法");
        show5();
    }

    private void show4(){
        System.out.println("私有方法体，可以拿来写“默认有方法体的方法”的重复的代码");
    }
    
    private static void show5(){
        System.out.println("私有方法体，可以拿来写“静态有方法体的方法”的重复的代码");
    }
}
