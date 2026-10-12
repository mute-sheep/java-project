public class LogicalOperator {
    public static void main(String[] args){
        //logical operator
        // Both are true, then the result is true
        System.out.println("------------------------------");
        System.out.println("&");
        System.out.println(true & false);
        System.out.println(true & true);
        System.out.println(false & false);
        System.out.println(false & true);
        // True if either operand is true
        System.out.println("------------------------------");
        System.out.println("|");
        System.out.println(true | false);
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(false | true);
        // True if the two values are different, false if they are the same.
        System.out.println("------------------------------");
        System.out.println("^");
        System.out.println(true ^ false);
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        //opposite
        System.out.println("------------------------------");
        System.out.println("!");
        System.out.println(!true);
        System.out.println(!false);
        //short-circuit logical operator
        // If the first operand already determines the result, the second one does not need to be evaluated.
        System.out.println("------------------------------");
        System.out.println("&&");
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(false && true);

        System.out.println("------------------------------");
        System.out.println("||");
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(false || true);
    }    
}
