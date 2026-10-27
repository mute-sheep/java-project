package ObjectOrientedAdvanced.Abstract;

public class test {
    public static void main(String[] args) {
        frog f = new frog("小青蛙",1);
        Dog d = new Dog("小狗", 2);
        Sheep s = new Sheep("小样",3);
        f.action();;
        f.drink();
        System.out.println();
        d.action();
        d.drink();
        System.out.println();
        s.action();
        s.drink();
    }
}
