package ObjectOrientedAdvanced.Polymorphism.UnderstandPolymorphism;

public class test {
    public static void main(String[] args) {
        study s = new study();
        s.setName("小明");
        s.setAge(18);
        
        teacher t = new teacher();
        t.setName("默默");
        t.setAge(22);

        manger m = new manger();
        m.setName("大该");
        m.setAge(28);
        getdata(s);
        getdata(t);
        getdata(m);
    }

    public static void getdata(person p){
        p.show();
        System.out.println();
    }
}
