package ObjectOrientedAdvanced.CodeBlock;

public class zi {
    private String name;
    static{
        System.out.println("构造了zi类");
    } //静态代码块
    public zi(){
        System.out.println("zi类无参构造");
    }
    public zi(String name){
        System.out.println("zi类带参构造");
    }
}
