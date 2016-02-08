package patterns.pim.с02_behavioral_patterns.interpreter;

import java.util.HashMap;

/**
 * Created by User1 on 08.02.2016.
 */
public class Context {
    private HashMap map = new HashMap();

    public Object get (Object name) {
        return map.get(name);
    }

    public void addVariable(Object name, Object value) {
        map.put(name, value);
    }
}
