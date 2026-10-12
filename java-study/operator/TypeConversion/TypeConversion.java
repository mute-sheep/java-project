public class TypeConversion {
    public static void main(String[] args){
        //implicit conversion
        byte a = 1;
        int b = 10;
        double c =10.1;
        int sum1 = a + b;
        double sum2 = a + b + c;
        System.out.println(sum1);
        System.out.println(sum2);
        //explicit conversion
        byte number1 = 1;
        short number2 = 2;
        byte num3 = (byte)(number1 + number2);
        double number4 = (double)num3;
        System.out.println(number4);
    }
}
