package ObjectOrientedAdvanced.Abstract;

public abstract class Animal{
    private String name;
    private int age;
    public Animal(){}
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public abstract void action();

    public void drink(){
        System.out.println("喝水");
    }
}

// 抽象类不能实例化
// 抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
// 可以有构造方法
// 抽象类的子类
//   要么重写抽象类中的所有抽象方法
//   要么是抽象类
