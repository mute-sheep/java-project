package ObjectOrientedAdvanced.Interface.ComprehensiveCase;

public class BasketballPlayer extends Player{

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("年龄:" + getAge() + "的" + getName() + "学打篮球");
    }
    
}
