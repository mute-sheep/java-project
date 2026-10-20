package stringStudy.CreateStringObject;

public class CreateStringObject {
    public static void main(String[] args) {
        // String Cannot Be Modified
        //Direct Create
        String s1 = "Direct Create";
        System.out.println(s1);
        // No-Arg Constructor
        String s2 = new String();
        System.out.println("No-Arg Constructor" + s2 + "111");
        // Has-Arg Constructor
        String s3 = new String("Has-Arg Constructor");
        System.out.println(s3);
        // Character Array(Advantage: Modifiable)
        char[] cha = {'c','h','s'};
        String s4 = new String(cha);
        System.out.println(s4);
        // Byte Array
        byte[] cha1 = {66,67,68};
        String s5 = new String(cha1);
        System.out.println(s5);
    }
}
