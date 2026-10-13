public class ForStatement {
    public static void main(String[] args){
        System.out.println("1-100求和");
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            num += i ;
        }
        System.out.println(num);

        System.out.println("1-100偶数求和");
        num = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                num += i;
            }
        }
        System.out.println(num);
    }    
}
