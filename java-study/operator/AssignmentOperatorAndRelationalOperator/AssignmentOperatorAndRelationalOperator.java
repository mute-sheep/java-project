public class AssignmentOperatorAndRelationalOperator{
    public static void main(String[] args){
        //assignment operator
        System.out.println("assignment operator");
        int a = 20;
        byte b = 10;
        a += b; 
        //a += b is equivalent to a = (int)(a + b)
        System.out.println(a);
        a -= b; 
        //a -= b is equivalent to a = (int)(a - b)
        System.out.println(a);
        a *= b; 
        //a *= b is equivalent to a = (int)(a * b)
        System.out.println(a);
        a /= b; 
        //a /= b is equivalent to a = (int)(a / b)
        System.out.println(a);
        a %= b; 
        //a %= b is equivalent to a = (int)(a % b)
        System.out.println(a);
        // relational operator
        System.out.println("relational operator");
        a = 20;
        b = 10;
        boolean c = a > b;
        System.out.println(c);
        c = a < b;
        System.out.println(c);
        c = a >= b;
        System.out.println(c);
        c = a <= b;
        System.out.println(c);
        c = a == b;
        System.out.println(c);
    }
}