package ObjectOrientedAdvanced.Polymorphism.UnderstandPolymorphism;

public class study extends person {
    @Override 
    public void show(){
        System.out.print("学生的信息是:");
        super.show();
    }
}
