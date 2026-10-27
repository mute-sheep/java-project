package ObjectOrientedAdvanced.Polymorphism.ComprehensivePractice;

public class test {
    public static void main(String[] args) {
        Animal a1 = new dog();
        Animal a2 = new cat();
        Person p1 = new Person();
        Person p2 = new Person();
        a1.setAge(2);
        a1.setColor("黑");
        a2.setAge(3);
        a2.setColor("灰");
        p1.setName("老王");
        p1.setAge(30);
        p2.setName("老李");
        p2.setAge(25);
        p1.keepPet(a1, "骨头");
        p2.keepPet(a2, "鱼");
    }
}
