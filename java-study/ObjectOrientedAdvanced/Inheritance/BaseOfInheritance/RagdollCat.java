package ObjectOrientedAdvanced.Inheritance.BaseOfInheritance;

public class RagdollCat extends cat {
    public static void name(){
        System.out.println("---布偶猫---");
    }
    public static void show(){
        name();
        eat();
        drink();
        Cataction();
    }
}

