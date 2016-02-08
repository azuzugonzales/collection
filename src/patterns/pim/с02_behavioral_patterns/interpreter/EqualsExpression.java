package patterns.pim.с02_behavioral_patterns.interpreter;

/**
 * Created by User1 on 08.02.2016.
 */
public class EqualsExpression extends ComparisonExpression {
    public EqualsExpression(Expression expressionA, Expression expressionB) {
        super(expressionA, expressionB);
    }

    public void interpret(Context c) {
        expressionA.interpret(c);
        expressionB.interpret(c);
        Boolean result = new Boolean(c.get(expressionA).equals(c.get(expressionB)));
        c.addVariable(this, result);
    }
}
