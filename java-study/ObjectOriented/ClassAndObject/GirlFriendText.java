public class GirlFriendText{
    public static void main(String[] args){
        GirlFriend one = new GirlFriend();
        one.name = "小白白";
        one.age = 20;
        one.height = 170;
        one.hobby = "看电视";

        GirlFriend two = new GirlFriend();
        two.name = "小嘿嘿";
        two.age = 18;
        two.height = 166;
        two.hobby = "玩游戏";

        one.show();
        System.out.println("-------------------");
        two.show();
    }
}
