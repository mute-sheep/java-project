package ObjectOrientedAdvanced.Polymorphism.ComprehensivePractice;

public class dog extends Animal{
    
    public dog() {
    }
    public dog(int age, String color) {
        super(age, color);
    }
    @Override 
    public void eat(String food){
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗两只前腿死死的抱住" + food + "猛吃");
    }
    public void lookHome(){
        System.out.println("看家");
    }
}


