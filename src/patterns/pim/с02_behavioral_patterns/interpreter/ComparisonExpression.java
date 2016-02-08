package patterns.pim.с02_behavioral_patterns.interpreter;

/**
 * Created by User1 on 08.02.2016.
 */
public abstract class ComparisonExpression implements Expression {
    protected Expression expressionA;
    protected Expression expressionB;

    public ComparisonExpression(Expression expressionA, Expression expressionB) {
        this.expressionA = expressionA;
        this.expressionB = expressionB;
    }
}
