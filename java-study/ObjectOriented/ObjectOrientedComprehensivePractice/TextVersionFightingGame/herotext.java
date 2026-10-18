import java.util.Random;
public class herotext {
    public static void main(String[] args){
        Random R = new Random();
        hero h = new hero();
        role[] heroPool = h.createHeroArray();

        int a;
        int b;

        do{
            a = R.nextInt(10);
            b = R.nextInt(10);
        }while(a == b);

        // 重点：新建对象拷贝属性，防止修改原始英雄数组数据
        role r1 = copyRole(heroPool[a]);
        role r2 = copyRole(heroPool[b]);

        int round = 1;
        System.out.println("现在登场的角色是:" + r1.getName() + " 和 " + r2.getName());

        // 两人都存活，才继续战斗
        while(r1.getHealth() > 0 && r2.getHealth() > 0){
            // 随机选攻击技能下标、防御技能下标
            int atkSkillIdx = R.nextInt(10);
            int defSkillIdx = R.nextInt(10);

            if(round % 2 == 1){
                // r1进攻 r2防御
                double damage = attack(r1,r2,atkSkillIdx,defSkillIdx,round);
                r2.setHealth(r2.getHealth() - damage);
            }else{
                // r2进攻 r1防御
                double damage = attack(r2,r1,atkSkillIdx,defSkillIdx,round);
                r1.setHealth(r1.getHealth() - damage);
            }
            System.out.println("-----------");
            round++;
        }

        // 结算胜负
        if(r1.getHealth() <= 0){
            System.out.println(r2.getName() + "胜利！");
        }else{
            System.out.println(r1.getName() + "胜利！");
        }
    }

    /**
     * 战斗方法：attacker攻击者，defender防御者
     * @return 最终造成伤害
     */
    public static double attack(role attacker,role defender,int atkIdx,int defIdx,int round){
        System.out.println("第" + round + "回合");
        String[] atkSkills = attacker.getAttackskillname();
        double[] atkPowerArr = attacker.getAttackPower();

        String[] defSkills = defender.getDefenseskillname();
        double[] defPowerArr = defender.getDefensePower();

        double rawDmg = atkPowerArr[atkIdx] - defPowerArr[defIdx];
        double finalDmg = Math.max(rawDmg,0); //伤害不能负数

        System.out.println(attacker.getName() + "使用【" + atkSkills[atkIdx] + "】");
        System.out.println(defender.getName() + "使用【" + defSkills[defIdx] + "】进行防御，受到伤害:" + finalDmg);
        return finalDmg;
    }

    // 复制角色对象，保护原始英雄池不会被战斗修改血量
    public static role copyRole(role src){
        return new role(
                src.getName(),
                src.getAttackskillname().clone(),
                src.getAttackPower().clone(),
                src.getDefenseskillname().clone(),
                src.getDefensePower().clone(),
                src.getHealth()
        );
    }
}
