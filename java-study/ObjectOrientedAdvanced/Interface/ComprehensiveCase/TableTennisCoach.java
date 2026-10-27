package ObjectOrientedAdvanced.Interface.ComprehensiveCase;

public class TableTennisCoach extends Coach implements Speak{

    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("年龄:" + getAge() + "的" + getName() + "教打乒乓球");
        
    }

    @Override
    public void speak() {
        System.out.println("讲英语");
        
    }
    
}
