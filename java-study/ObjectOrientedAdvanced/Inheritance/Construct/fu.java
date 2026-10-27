package ObjectOrientedAdvanced.Inheritance.Construct;

public class fu {
    String name;
    int age;
    public fu(){
        System.out.println("成功使用父类的无参构造");
    }
    public fu(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("成功使用父类的带参构造");
    }
}
