package patterns.pim.с01_creational_patterns.abstract_factory.new_abstract_factory;

/**
 * Created by Azuzu on 05.02.2016.
 */
public class BuilderEmployee extends Employee {
    private static final String WORKING = "BUILDERS";
    private static final String COMMA = ",";

    public String getWorking() {
        return WORKING;
    }

    public String getAllWorking() {
        return getManager() + EOL_STRING +
                getQualityControl() + COMMA + SPACE + getAnalyst() +
                SPACE  + WORKING + EOL_STRING;
    }


}
