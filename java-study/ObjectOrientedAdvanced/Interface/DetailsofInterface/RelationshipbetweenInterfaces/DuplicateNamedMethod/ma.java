package ObjectOrientedAdvanced.Interface.DetailsofInterface.RelationshipbetweenInterfaces.DuplicateNamedMethod;

public class ma implements inter1,inter2{
    @Override
    public void mathon1() {
        System.out.println("mathon1");        
    }

    @Override
    public void mathon2() {
        System.out.println("mathon2");
    }

    @Override
    public void mathon3() {
        System.out.println("mathon3");
    }
    
    @Override
    public void mathon4() {
        System.out.println("mathon4");
    }
}
//多接口连接重名问题不大