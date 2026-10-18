public class EncapsulationText{
    public static void main(String[] args){
        Girl one = new Girl();
        one.setname("小白白");
        one.setage(20);
        
        Girl two = new Girl();
        two.setname("小黑黑");
        two.setage(22);

        System.out.println(one.getname());
        System.out.println(one.getage());
        System.out.println("-----------------------------------");
        System.out.println(two.getname());
        System.out.println(two.getage( ));
    }
}
