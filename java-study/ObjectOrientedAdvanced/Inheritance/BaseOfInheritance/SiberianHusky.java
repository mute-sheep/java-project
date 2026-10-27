package ObjectOrientedAdvanced.Inheritance.BaseOfInheritance;

public class SiberianHusky extends dog {
    public static void name(){
        System.out.println("---哈士奇---");
    }
    public static void action(){
        System.out.println("拆家");
    }
    public static void show(){
        name();
        eat();
        drink();
        Dogaction();
        action();
    }
}
