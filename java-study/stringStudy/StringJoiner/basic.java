package stringStudy.StringJoiner;
import java.util.StringJoiner;
public class basic {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---");
        StringJoiner sj1 = new StringJoiner("===","[","]");
        sj.add("aaa").add("ddd");
        int l = sj1.add("ccc").length();
        System.out.println(sj.toString());
        System.out.println(sj1);
        System.out.println(l);
    }
}
