package ArrayList.UseOfArrayList;
import java.util.ArrayList;
public class UseOfArrayList {
    public static void main(String[] args) {
        //Create Collection
        ArrayList<String> list = new ArrayList<>();
        System.out.println("初始化");
        System.out.println(list);
        //add
        System.out.println("-----add-----");
        list.add("aaa"); 
        System.out.println(list.add("bbb")); //return true;
        list.add("ccc");
        list.add("ddd");
        list.add("fff");
        System.out.println(list);
        
        // delete
        System.out.println("-----delete-----");
        boolean S = list.remove("aaa");  //找到返回true,没找到返回false;
        System.out.println(S);
        System.out.println(list.remove(0));  //返回修改的数字
        System.out.println(list);

        //change
        System.out.println("-----set-----");
        list.set(0, "111");
        System.out.println(list);

        //Find
        System.out.println("查找相当于便利了");
        for(int i =0;i < list.size();i++){
            System.out.println(list.get(i));
        }
    }    
}
