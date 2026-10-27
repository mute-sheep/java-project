public class NativeDog extends dog {
    String name = "---中华田园犬---";
    @Override 
    public void eat(){
        System.out.println("吃剩饭");
    }
    public void show(){
        System.out.println(name);
        eat();
        drink();
        look();
    }
}

