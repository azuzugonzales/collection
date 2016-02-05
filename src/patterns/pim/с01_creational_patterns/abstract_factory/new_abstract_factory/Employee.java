package patterns.pim.с01_creational_patterns.abstract_factory.new_abstract_factory;

/**
 * Created by Azuzu on 05.02.2016.
 */
public abstract class Employee {
    private String manager;
    private String qualityControl;
    private String analyst;

    public static final String EOL_STRING = System.getProperty("line.separator");
    public static final String SPACE = " ";

    public String getManager() {
        return manager;
    }
    public String getQualityControl() {
        return qualityControl;
    }
    public String getAnalyst() {
        return analyst;
    }

    public void setManager(String newManager) {
        manager = newManager;
    }
    public void setQualityControl(String newQualityControl) {
        qualityControl = newQualityControl;
    }
    public void setAnalyst(String newAnalyst) {
        analyst = newAnalyst;
    }

    public String getAllEmployee() {
        return manager + EOL_STRING +
                qualityControl + SPACE + analyst + EOL_STRING;
    }


}
