package patterns.pim.с02_behavioral_patterns.interpreter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by User1 on 08.02.2016.
 */
public class VariableExpression implements Expression {
    private Object lookup;
    private String methodName;

    public VariableExpression(Object newLookup, String newMethodName) {
        lookup = newLookup;
        methodName = newMethodName;
    }

    public void interpret(Context c) {
        try {
            Object source = c.get(lookup);
            if (source != null) {
                Method method = source.getClass().getMethod(methodName, null);
                Object result = method.invoke(source, null);
                c.addVariable(this, result);
            }
        } catch (NoSuchMethodException exc) { }
        catch (IllegalAccessException exc) { }
        catch (InvocationTargetException exc) { }
    }
}
