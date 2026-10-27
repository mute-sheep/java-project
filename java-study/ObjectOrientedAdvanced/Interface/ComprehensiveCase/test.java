package ObjectOrientedAdvanced.Interface.ComprehensiveCase;

public class test {
    public static void main(String[] args) {
        TableTennisCoach tc = new TableTennisCoach("大白", 30);
        TableTennisPlayer tp = new TableTennisPlayer("小白", 20);
        BasketballCoach bc = new BasketballCoach("大黑", 32);
        BasketballPlayer bp = new BasketballPlayer("小黑", 10);
        tc.teach();
        tc.speak();
        System.out.println();
        bc.teach();
        System.out.println();
        tp.play();
        tp.speak();
        System.out.println();
        bp.play();
    }
}
