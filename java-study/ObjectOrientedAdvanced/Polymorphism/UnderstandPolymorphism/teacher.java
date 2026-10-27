package ObjectOrientedAdvanced.Polymorphism.UnderstandPolymorphism;

public class teacher extends person{
    @Override 
    public void show(){
        System.out.print("老师的信息是:");
        super.show();
    }
}
