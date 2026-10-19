package ObjectOriented.ObjectOrientedComprehensivePractice.ObjectArrayThree;

public class Phone {
    private String Brand;
    private double price;
    private String color;
    public Phone() {
    }
    public Phone(String brand, double price, String color) {
        Brand = brand;
        this.price = price;
        this.color = color;
    }
    public String getBrand() {
        return Brand;
    }
    public void setBrand(String brand) {
        Brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
}
