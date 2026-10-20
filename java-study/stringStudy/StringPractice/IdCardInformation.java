package stringStudy.StringPractice;

public class IdCardInformation {
    public static void main(String[] args) {
        String Id = "544382927584373929";
        String year = Id.substring(6,10);
        String mouth = Id.substring(10,12);
        String day = Id.substring(12,14);
        System.out.println("身份信息:");
        System.out.println("出生日期:" + year + "年" + mouth + "月" + day + "日");
        char gender = Id.charAt(16);
        int n = gender - 48;
        if(n % 2 == 0){
            System.out.println("性别:女");
        }else{
            System.out.println("性别:男");
        }
    }
}
