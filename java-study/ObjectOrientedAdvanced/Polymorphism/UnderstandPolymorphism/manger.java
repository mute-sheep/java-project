package ObjectOrientedAdvanced.Polymorphism.UnderstandPolymorphism;

public class manger extends person{
    @Override 
    public void show(){
        System.out.print("管理员的信息是:");
        super.show();
    }
}
