package ObjectOriented.ObjectOrientedComprehensivePractice.ObjectArrayThree;

public class PhoneText {
    public static void main(String[] args) {
        Phone p[] = new Phone[3];
        Phone p1 = new Phone("小米",9999.99,"黑");
        Phone p2 = new Phone("iphone",8999.99,"白");
        Phone p3 = new Phone("华为",10000,"紫");
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;
        double sum = 0;
        for(int i = 0;i < p.length;i++){
            sum += p[i].getPrice();
        }

        double avg = sum / p.length;
        System.out.println(avg);
    }
}
