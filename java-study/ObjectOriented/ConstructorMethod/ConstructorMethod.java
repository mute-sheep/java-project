package ObjectOriented.ConstructorMethod;

public class ConstructorMethod {
    private String name;
    private int age;
    //No-Arg Constructor
    public ConstructorMethod(){
        System.out.println("调用了无参构造");
    }
    //Has-Arg Constructor
    public ConstructorMethod(String name,int age){
        System.out.println("调用了有参构造");
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name);
        System.out.println(age);
    }
}
