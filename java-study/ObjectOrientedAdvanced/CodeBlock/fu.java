package ObjectOrientedAdvanced.CodeBlock;

public class fu {
    private String name;
    {
        System.out.println("构造了fu类");
    }//构造代码块(不够灵活)
    public fu(){
        System.out.println("fu类无参构造");
    }
    public fu(String name){
        System.out.println("fu类带参构造");
    }
}
