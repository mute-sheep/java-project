public class role{
    //Member Variable
    private String name;
    private String[] attackskillname;
    private double[] attackPower;
    private String[] defenseskillname;
    private double[] defensePower;
    private double health;
    //No-Arg Constructor
    public role(){};
    //Has-Arg Constructor
    public role(String name,String[] attackskillname,double[] attackPower,String[] defenseskillname,double[] defensePower,double health){
        this.name = name;
        this.attackskillname = attackskillname;
        this.attackPower = attackPower;
        this.defenseskillname = defenseskillname;
        this.defensePower = defensePower;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAttackskillname() {
        return attackskillname;
    }

    public void setAttackskillname(String[] attackskillname) {
        this.attackskillname = attackskillname;
    }

    public double[] getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double[] attackPower) {
        this.attackPower = attackPower;
    }

    public String[] getDefenseskillname() {
        return defenseskillname;
    }

    public void setDefenseskillname(String[] defenseskillname) {
        this.defenseskillname = defenseskillname;
    }

    public double[] getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(double[] defensePower) {
        this.defensePower = defensePower;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}