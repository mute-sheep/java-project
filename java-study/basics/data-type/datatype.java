public class datatype {
    public static void main(String[] args){
        //整形
        //数值范围:-128~127 内存占用：1
        byte a = 10;
        //数值范围:-32768~32676 内存占用：2
        short b = 20;
        //数值范围:-2147483648~2147483647 内存占用:4
        int c = 30;
        //数值范围:-9223372036854775808~9223372036854775807 内存占用:8
        long d = 9999999L;
        //浮点数
        //数值范围:-3.401298e-38~3.402823e+38 内存占用:4
        float e = 3.14F;
        //数值范围:-4.9000000e-324~1.797693e+308 内存占用:8
        double f = 3.1415926;
        //字符
        char g = '你';
        //布尔型
        boolean h = true;
        boolean l = false;
        //print
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(l);
    }    
}
