package ObjectOrientedAdvanced.Polymorphism.AdvantagesAndDisadvantagesOfPolymorphism;

public class text {
    public static void main(String[] args) {
        //多态的优势可以实现解耦合
        Animal a1 = new dog();
        Animal a2 = new cat();
        show(a1);
        System.out.println();
        show(a2);
        //多态的劣势，不能调用子类的特有功能
        // a1.action();
        //解决方法：强转（要用到instanceof）
        System.out.println("写法一");
        if(a1 instanceof dog){
            dog d = (dog)a1;
            d.action();
        }else if(a1 instanceof cat){
            cat c = (cat)a1;
            c.action();
        }else{
            System.out.println("没有这个类");
        }

        System.out.println("写法二");
        if(a2 instanceof dog d){
            d.action();
        }else if(a2 instanceof cat c){
            c.action();
        }else{
            System.out.println("没有这个类");
        }
    }


    public static void show(Animal a){
        a.eat();
        a.drink();
    }
}
