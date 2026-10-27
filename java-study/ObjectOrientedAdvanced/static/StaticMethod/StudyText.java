import java.util.ArrayList;

public class StudyText {
    public static void main(String[] args) {
        Study s1 = new Study("小宝", 22);
        Study s2 = new Study("大宝", 24);
        Study s3 = new Study("大大宝", 26);
        ArrayList list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        double avg = StudyUtil.getStudyAverage(list);
        System.out.println(avg);
        
    }
}
