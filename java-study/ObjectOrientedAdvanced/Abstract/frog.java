package ObjectOrientedAdvanced.Abstract;

public class frog extends Animal{
    public frog(){}
    public frog(String name,int age){
        super(name,age);
    }
    @Override 
    public void action(){
        System.out.println("吃虫子");
    }     
}
