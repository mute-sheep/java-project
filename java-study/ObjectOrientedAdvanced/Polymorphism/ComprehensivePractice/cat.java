package ObjectOrientedAdvanced.Polymorphism.ComprehensivePractice;

public class cat extends Animal{
    
    public cat() {
	}

	public cat(int age, String color) {
		super(age, color);
	}
    @Override 
    public void eat(String food){
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫眯着眼睛侧着头吃" + food);
    }
	public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
