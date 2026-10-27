package ObjectOrientedAdvanced.Interface.UnderstandInterface;

public class frog extends Animal implements Swin{
    public frog(){}
    public frog(String name,int age){
        super(name,age);
    }
    @Override 
    public void eat(){
        System.out.println("吃虫子");
    }
    @Override 
    public void swin(){
        System.out.println("蛙泳");
    }
}
