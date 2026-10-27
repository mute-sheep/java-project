package ObjectOrientedAdvanced.Polymorphism.CallFeature;

public class text {
    public static void main(String[] args) {
        fu f = new zi();
        System.out.println(f.name);  //调用变量的时候看的是父类的变量，也就是等号左边的变量
        f.show(); //调用方法时就是看子类
                  //不过两者编译的时候都要看父类，也就是等号左边，不然过不了；
        
    }
}
