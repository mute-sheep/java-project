import java.util.Random;
public class MethodOverload {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(3) + 2;
        int sum = switch(n){
            case 2 -> sum(r.nextInt(99),r.nextInt(99));
            case 3 -> sum(r.nextInt(99),r.nextInt(99),r.nextInt(99));
            case 4 -> sum(r.nextInt(99),r.nextInt(99),r.nextInt(99),r.nextInt(99));
            default -> 0;
        };
        System.out.println("n="+n+"，总和="+sum);
    }
    public static int sum(int a,int b ) {
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        return a + b;
    }
    
    public static int sum(int a,int b,int c) {
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        return a + b + c;
    }
    
    public static int sum(int a,int b,int c,int d) {
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        System.out.println("d:" + d);
        return a + b + c + d ;
    }        
}
