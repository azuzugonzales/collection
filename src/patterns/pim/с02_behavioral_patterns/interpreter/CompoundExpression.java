package patterns.pim.с02_behavioral_patterns.interpreter;

/**
 * Created by User1 on 08.02.2016.
 */
public abstract class CompoundExpression implements Expression {
    protected ComparisonExpression expressionA;
    protected ComparisonExpression expressionB;

    public CompoundExpression(ComparisonExpression expressionA,
                              ComparisonExpression expressionB) {
        this.expressionA = expressionA;
        this.expressionB = expressionB;
    }
}
