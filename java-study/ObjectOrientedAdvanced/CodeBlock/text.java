package ObjectOrientedAdvanced.CodeBlock;

public class text {
    public static void main(String[] args) {
        {
            zi z1 = new zi();
            zi z2 = new zi("111");
        } // 局部代码块（已淘汰）
        System.out.println();
        fu f1 = new fu();
        fu f2 = new fu("222");
        // System.out.println(z1);
    }
}
