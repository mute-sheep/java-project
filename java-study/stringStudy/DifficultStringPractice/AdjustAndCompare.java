package stringStudy.DifficultStringPractice;

public class AdjustAndCompare {
    public static void main(String[] args) {
        String data1 = "abcd";
        String data2 = "dabc";
        System.out.println(fun(data1, data2));
    }
    
    public static boolean fun(String data1,String data2) {
        if(data1 == null || data2 == null){
            System.out.println("有空字符串");
            return false;
        }
        if(data1.length() != data2.length()){
            System.out.println("长度不一样");
            return false;
        }
        for(int i = 0;i < data1.length();i++){
            data1 = data1.substring(1) + data1.charAt(0);
            if(data1.equals(data2)){
                return true;
            }
        }
        return false;
    }
}
