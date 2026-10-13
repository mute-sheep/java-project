public class SwitchStatement{
    public static void main(String[] args){
        int number1 = 90;
        String res = "";
        switch(number1){
            case 90:
                res = "优秀";
                break;
            case 80:
                res = "良好";
                break;
            case 70:
                res = "一般";
                break;
            case 60:
                res = "合格";
                break;
            default:
                res = "不及格";
        }
        System.out.println(res);
    }
}