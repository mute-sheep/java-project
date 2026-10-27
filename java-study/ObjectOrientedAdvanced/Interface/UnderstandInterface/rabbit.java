package ObjectOrientedAdvanced.Interface.UnderstandInterface;

public class rabbit extends Animal{
    public rabbit(){}
    public rabbit(String name,int age){
        super(name,age);
    }
    @Override 
    public void eat(){
        System.out.println("吃胡萝卜");
    }
}