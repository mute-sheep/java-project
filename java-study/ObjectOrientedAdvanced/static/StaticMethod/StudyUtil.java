import java.util.ArrayList;

public class StudyUtil {
    private StudyUtil(){}
    public static double getStudyAverage(ArrayList<Study> study){
        if(study.size() == 0){
            System.out.println("无学生,无法计算平均分");
            return -1; 
        }
        double max = study.get(0).getAge();
        for(int i = 1;i < study.size();i++){
            if(max < study.get(i).getAge()){
                max = study.get(i).getAge();
            }
        }
        return max;
    }
}
