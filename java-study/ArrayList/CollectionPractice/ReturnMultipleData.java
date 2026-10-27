package ArrayList.CollectionPractice;
import java.util.ArrayList;
public class ReturnMultipleData{
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("华为",2999.99);
        Phone p2 = new Phone("ipone",8999.99);
        Phone p3 = new Phone("oppoa5",99.99);
        list.add(p1);
        list.add(p2);   
        list.add(p3);
        ArrayList<Phone> p = FindArrayList(list);
        System.out.println("手机价格低于3000的有:");
        if(p.size() == 0){
            System.out.println("无");
        }
        for(int i = 0;i < p.size();i++){
            System.out.println("品牌:" + p.get(i).getBrand() + "  " +p.get(i).getPrice());
        }
    }
        
        public static ArrayList<Phone> FindArrayList(ArrayList<Phone> list){
            ArrayList<Phone> arr = new ArrayList<>();
            for(int i = 0;i < list.size();i++){
                if(list.get(i).getPrice() < 3000){
                    arr.add(list.get(i));
                }
            }
            return arr;
        }
}