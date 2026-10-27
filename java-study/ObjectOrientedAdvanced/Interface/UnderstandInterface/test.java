package ObjectOrientedAdvanced.Interface.UnderstandInterface;

public class test {
    public static void main(String[] args) {
        frog f = new frog("小青", 1);
        Dog d = new Dog("小狗",1);
        rabbit r = new rabbit("小兔",2);
        System.out.println("name:" + f.getName());
        System.out.println("age:" + f.getAge());
        f.eat();
        f.swin();
        System.out.println();
        
        System.out.println("name:" + d.getName());
        System.out.println("age:" + d.getAge());
        d.eat();
        d.swin();
        System.out.println();

        System.out.println("name:" + r.getName());
        System.out.println("age:" + r.getAge());
        r.eat();
        System.out.println();
    }
}
