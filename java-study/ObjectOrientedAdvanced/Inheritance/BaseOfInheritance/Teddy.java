package ObjectOrientedAdvanced.Inheritance.BaseOfInheritance;

public class Teddy extends dog {
    public static void name(){
        System.out.println("---泰迪---");
    }
    public static void action(){
        System.out.println("蹭一蹭");
    }
    public static void show(){
        name();
        eat();
        drink();
        Dogaction();
        action();
    }
}
