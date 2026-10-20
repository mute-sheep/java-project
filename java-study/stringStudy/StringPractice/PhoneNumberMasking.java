package stringStudy.StringPractice;

public class PhoneNumberMasking {
    public static void main(String[] args) {
        String number = "11111111111";
        String start = number.substring(0,3);
        String end = number.substring(7);
        System.out.println(start + " **** " + end);
    }    
}
