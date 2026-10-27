public class car{
    private String name;
    private int age;
    private String color;
    public car() {
    }
    public car(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    
    //内部类
    public class Engine{
        private String brand;
        private int use;

        public Engine() {
        }

        public Engine(String brand, int use) {
            this.brand = brand;
            this.use = use;
        }

        private void show(){
            System.out.println("现在是内部类");
            System.out.println(color + "色的" + name + "已经被使用了" + age + "年，“" + brand + "”发动机的使用年限为:" + use);
        }
    }
    public void show(String name,int age){
        System.out.println("现在是外部类");
        Engine e = new Engine(name, age);
        System.out.println(color + "色的" + name + "已经被使用了" + age + "年，“" + e.brand + "”发动机的使用年限为:" + e.use);
        System.out.println();
        e.show();
    }
}