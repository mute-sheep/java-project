package ObjectOrientedAdvanced.Inheritance.InheritanceSummaryPractice;

public class text {
    public static void main(String[] args){
        Manger m = new Manger("M1","张三",6999.99,3999.99);
        cook c = new cook("C1","李四",5999.99);
        System.out.println("Id：" + m.getId() + " name:" + m.getName() + " salary:" + m.getSalary() + " mangeSalary：" + m.getMangeSalary());
        System.out.println("Id：" + c.getId() + " name:" + c.getName() + " salary:" + c.getSalary());
    }
}
