package ObjectOrientedAdvanced.Inheritance.Construct;

public class zi extends fu{
    public zi(){
        super();//可写可以不写,不写虚拟机会自动调用
        System.out.println("成功调用子类的无参构造");
    }
    public zi(String name,int age){
        super(name, age);
        System.out.println("成功调用子类的带参构造");
    }
}
