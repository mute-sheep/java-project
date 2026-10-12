public class IncrementAndDecrementOperator {
    public static void main(String[] args){
        //increment operator notice:On the same line, if the increment or decrement is alone, putting it before or after the variable has no effect on the result.
        int a = 10;
        a++;
        System.out.println(a);//11
        ++a;
        System.out.println(a);//12
        //decrement operator
        a--;
        System.out.println(a);//11
        --a;
        System.out.println(a);//10
        // participate in calculation
        int b = a;
        System.out.println(b);//10
        b = a++;
        System.out.println(b);//10
        b = ++a;
        System.out.println(b);//12
        System.out.println(b);//12
        b = a--;
        System.out.println(b);//12
        b = --a;
        System.out.println(b);//10
    }    
}
