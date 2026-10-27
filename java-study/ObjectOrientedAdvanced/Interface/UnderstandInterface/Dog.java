package ObjectOrientedAdvanced.Interface.UnderstandInterface;

public class Dog extends Animal implements Swin{
    public Dog(){}
    public Dog(String name,int age){
        super(name,age);
    }
    @Override 
    public void eat(){
        System.out.println("吃骨头");
    }
    @Override 
    public void swin(){
        System.out.println("狗刨");
    }
}