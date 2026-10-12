public class StringConcatenation {
    public static void main(String[] args){
        //string concatenation
        System.out.println(1 + "abc");
        System.out.println("abc" + true);
        System.out.println(1 + 2 + "abc");
        //left to right
        System.out.println(1 + 2 +"abc" + 2 + 1);
        //When a character participates in operations, it is converted to the int type. Refer to the ASCII table for details
        System.out.println(1 + 'a');
        System.out.println(1 + 'A');
    }    
}
