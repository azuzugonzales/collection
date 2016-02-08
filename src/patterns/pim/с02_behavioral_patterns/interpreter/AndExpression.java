package patterns.pim.с02_behavioral_patterns.interpreter;

/**
 * Created by User1 on 08.02.2016.
 */
public class AndExpression extends CompoundExpression {
    public AndExpression(ComparisonExpression expressionA, ComparisonExpression expressionB) {
        super(expressionA, expressionB);
    }

    public void interpret (Context c) {
        expressionA.interpret(c);
        expressionB.interpret(c);
        Boolean result = new Boolean(((Boolean)c.get(expressionA)).booleanValue() &&
                ((Boolean)c.get(expressionB)).booleanValue());
        c.addVariable(this, result);
    }
}
