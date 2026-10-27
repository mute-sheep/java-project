package ObjectOrientedAdvanced.Inheritance.InheritanceSummaryPractice;

public class Manger extends Employee {
    private double MangeSalary;
    public Manger(){
    }
    public Manger(String id, String name, double salary, double mangeSalary) {
        super(id, name, salary);
        MangeSalary = mangeSalary;
    }
    public double getMangeSalary() {
        return MangeSalary;
    }
    public void setMangeSalary(double mangeSalary) {
        MangeSalary = mangeSalary;
    }
    @Override 
    public void work(){
        super.work();
        System.out.println("管理其他人");
    }
    
}
