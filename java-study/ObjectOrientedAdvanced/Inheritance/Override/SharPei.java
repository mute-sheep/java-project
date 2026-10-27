public class SharPei extends dog{
    String name = "---沙皮狗---";
    @Override 
    public void eat(){
        super.eat();
        System.out.println("吃骨头");
    }
    public void show(){
        System.out.println(name);
        eat();
        drink();
        look();
    }
}
