public class TernaryOperator {
    public static void main(String[] args){
        //ternary operator
        int a = 10;
        int b = 20;
        int c = 30;
        int d = a < b ? b:a;
        int e = d < c ? c:d;
        int f = (a < b ? b:a) < c ? c : (a < b ? b:a);
        System.out.println(e);
        System.out.println(f);
    }    
}
