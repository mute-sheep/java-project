package stringStudy.StringPractice;

public class SensitiveWordReplacement {
    public static void main(String[] args) {
        String s[] = {"cd","sb","cnm","tmd","nmsl","mlgb","wqnm","mm"};
        String s1 = "cnm,你是不是sb";
        for(int i = 0;i < s.length;i++){
            s1 = s1.replace(s[i], "***");
        }
        System.out.println(s1);
    }
}
