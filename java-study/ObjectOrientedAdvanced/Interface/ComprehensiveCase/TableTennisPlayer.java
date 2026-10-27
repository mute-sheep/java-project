package ObjectOrientedAdvanced.Interface.ComprehensiveCase;

public class TableTennisPlayer extends Player implements Speak {

    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("年龄:" + getAge() + "的" + getName() + "学打乒乓球");
        
    }

    @Override
    public void speak() {
        System.out.println("讲英语");
        
    }

}
