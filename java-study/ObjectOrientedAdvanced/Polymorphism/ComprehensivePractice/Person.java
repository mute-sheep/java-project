package ObjectOrientedAdvanced.Polymorphism.ComprehensivePractice;

public class Person {
    private String name;
    private int age;
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void keepPet(Animal a,String something){
        System.out.println("年龄为" + age + "岁的" + name +"养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的宠物");
        if(a instanceof dog d){
            d.eat(something);
        }else if(a instanceof cat c){
            c.eat(something);
        }else{
            System.out.println("没有这种宠物");
        }
        System.out.println();
    }
}
