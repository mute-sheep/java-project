package ObjectOriented.ObjectOrientedComprehensivePractice.ObjectArrayFour;

public class GirlFriendText {
    public static void main(String[] args) {
        GirlFriend girl[] = new GirlFriend[4];
        GirlFriend g1 = new GirlFriend("小小",18,"学习");
        GirlFriend g2 = new GirlFriend("小宝",19,"打游戏");
        GirlFriend g3 = new GirlFriend("大宝",20,"看电视");
        GirlFriend g4 = new GirlFriend("小里",21,"出去玩");
        girl[0] = g1;
        girl[1] = g2;
        girl[2] = g3;
        girl[3] = g4;
        double sum = 0;
        for(int i = 0;i < girl.length;i++){
            sum += girl[i].getAge();        
        }
        double avg = sum / girl.length;
        System.out.println("女朋友的平均年龄：" + avg);
        int count = 0;
        for(int i = 0;i < girl.length;i++){
            if(girl[i].getAge() < avg){
                System.out.println(girl[i].getName() + "  " + girl[i].getAge() + "  " + girl[i].getHobby());
                count++;
            }
        }
        System.out.println(count + "个");
    }
}