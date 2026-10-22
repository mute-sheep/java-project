public class Study{
    private String Id;
    private String name;
    private int age;
    private String gender;
    public Study() {
    }
    public Study(String id, String name, int age, String gender) {
        Id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
}