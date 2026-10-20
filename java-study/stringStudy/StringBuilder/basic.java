package stringStudy.StringBuilder;

public class basic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder SB = new StringBuilder("我有开头:");
        sb.append("没事，我不气");
        System.out.println(SB);
        System.out.println(sb);
        SB.append("我还会反转");
        System.out.println(SB);
        SB.reverse();
        System.out.println(SB);
        String s = sb.toString();
        System.out.println("----------" + s);
        // Chain Programming
        System.out.println("-------------------------------");
        String s1 = sb.append("----我真的不气嘛").toString().replace("气", "爽");
        System.out.println(s1);
        
    }
}
