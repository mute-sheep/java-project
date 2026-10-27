package ObjectOrientedAdvanced.Abstract;

public class Sheep extends Animal{
    public Sheep(){}
    public Sheep(String name,int age){
        super(name,age);
    }
    @Override 
    public void action(){
        System.out.println("吃骨头");
    }     
}
