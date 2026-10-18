public class Girl {
    private String name;
    private int age;

    public void setname(String n){
        name = n;
    }

    public void setage(int a){
        if(a >= 18 && age <= 50){
            age = a;
        }else {
            System.out.println("输入无效");
        }
    }
    public String getname(){
        return name;
    }
    
    public int getage(){
        return age;
    }
}
