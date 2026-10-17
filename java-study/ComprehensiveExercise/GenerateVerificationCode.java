package ComprehensiveExercise;
import java.util.Random;
public class GenerateVerificationCode {
    public static void main(String[] args) {
        Random r = new Random();
        char Letter[] = new char[52];
        for(int i = 0; i < 26; i++){
            Letter[i] = (char)('A' + i);
        }
        for(int i = 26; i < Letter.length; i++){
            Letter[i] = (char)('a' + (i - 26));
        }

        String code = "" + Letter[r.nextInt(52)] + Letter[r.nextInt(52)] + Letter[r.nextInt(52)] + r.nextInt(10);
        System.out.println("【糖心vlog】验证码，" + code + "用于手机验证码登录，5分钟内有效。验证码提供给他人可能导致账号被盗，请勿泄露，谨防被骗。");
        System.out.println("温馨提示:由于你上次拍摄《卡在墙里的小男孩》没撑过5分钟，最近会加戏一场，请尽快登录，选择拍摄时间");
    }
}
