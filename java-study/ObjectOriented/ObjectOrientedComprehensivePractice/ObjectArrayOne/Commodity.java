package ObjectOriented.ObjectOrientedComprehensivePractice.ObjectArrayOne;

public class Commodity {
    private int id;
    private String name;
    private double price;
    private int count;
    public Commodity(){}
    public Commodity(int id,String name,double price,int count){
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public void show(){
        System.out.println(id + "  " + name);
        System.out.println("price:" + price + "  count:" + count);
        System.out.println();
    }
}
