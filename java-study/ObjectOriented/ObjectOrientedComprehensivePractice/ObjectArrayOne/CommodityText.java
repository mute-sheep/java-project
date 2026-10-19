package ObjectOriented.ObjectOrientedComprehensivePractice.ObjectArrayOne;

public class CommodityText {
    public static void main(String[] args) {
        Commodity g1 = new Commodity(1,"ipone18",9999.99,100);
        Commodity g2 = new Commodity(2,"荣耀",8888.99,100);
        Commodity g3 = new Commodity(3,"poppoa5",200,100000);
        Commodity good[] = {g1,g2,g3};
        for(int i = 0;i < good.length;i++){
            good[i].show();
        }
    }
}
