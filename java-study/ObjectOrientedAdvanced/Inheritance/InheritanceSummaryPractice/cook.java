package ObjectOrientedAdvanced.Inheritance.InheritanceSummaryPractice;

public class cook extends Employee{
    public cook(){}
    public cook(String id, String name, double salary){
        super(id,name,salary);
    }
    @Override 
    public void work(){
        super.work();
        System.out.println("炒菜");
    }
}
