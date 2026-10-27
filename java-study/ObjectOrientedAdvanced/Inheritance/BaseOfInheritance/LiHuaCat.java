package ObjectOrientedAdvanced.Inheritance.BaseOfInheritance;

public class LiHuaCat extends cat{
    public static void name(){
        System.out.println("---中国梨花猫---");
    }
    public static void show(){
        name();
        eat();
        drink();
        Cataction();
    }
}
