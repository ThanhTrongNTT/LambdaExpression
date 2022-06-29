/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 08:50
 * Filename : LambdaExpression
 */
public class LambdaExpression {
    Message helloWorld = message -> System.out.println("\n"+message);
    SumIntegers sumIntegers = integers -> {
        Integer result = 0;
        for(int i = 0;i<integers.length;i++ ){
          result += integers[i];
        }
        return result;
    };
}
class LambdaExpressionExample{
    public static void example(){
        LambdaExpression lambdaExpression = new LambdaExpression();
        lambdaExpression.helloWorld.showMessage("Xin chào mọi người!!");

        Integer sum = lambdaExpression.sumIntegers.sumIntegers(12,2,2,34,5,3,3,1,2);
        System.out.println("Sum of Integers: "+ sum);
    }
}
