package patterns.pim.с02_behavioral_patterns.interpreter;

/**
 * Created by User1 on 08.02.2016.
 */
public class ConstantExpression implements Expression {
    private Object value;

    public ConstantExpression(Object newValue) {
        value = newValue;
    }

    public void interpret(Context c) {
        c.addVariable(this, value);
    }
}
