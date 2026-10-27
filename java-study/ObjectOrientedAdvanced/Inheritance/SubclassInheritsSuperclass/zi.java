public class zi extends fu{
    String name = "儿子";
    public void eat(){
        System.out.println("吃奶粉");
    }
    public void show(String name){
        System.out.println("就近原则:" + name); //就近原则:这里的name指的是传进来的name，因为它离调用出最近
        System.out.println("this:" + this.name); //这里的name是调用者的name,在测试类中调用了zi类,所以this指的是zi对象的地址值
        this.eat();
        System.out.println("--------");
        System.out.println("super" + super.name); //这是的super是指向直接连接的那个父类
        super.eat();
        drink(); //这里依旧是就近原则，不过最近的在fu类
    }
}


// 传递原则
// 子类无法获得到父类的构造方法
// 子类可与获得到父类的公有成员变量，也能获得私有成员变量，但是私有成员变量只能通过get方法获得
// 子类可以获取到公有的方法，获得不了私有的方法

//**虚方法表（vtable）：每个类一张，存放可重写实例方法的地址，用来实现多态的动态绑定。**
// - 子类复制父类的表，重写方法就替换对应地址；
// - 对象头的类型指针指向类，运行时查表找到要执行的方法；
// - private、static、final 方法不进虚方法表，编译期就确定调用。

// 子类会优先调用虚方法表，如果虚方法表里面没有，才会去调用父类的方法，调用父类的方法主要是静态方法