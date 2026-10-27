public class SiberianHusky extends dog {
    String name = "---哈士奇---";
    public void action(){
        System.out.println("拆家");
    }
    public void show(){
        System.out.println(name);
        eat();
        drink();
        look();
        action();
    }
}
