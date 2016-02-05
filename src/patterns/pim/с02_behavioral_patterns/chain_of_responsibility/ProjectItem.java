package patterns.pim.с02_behavioral_patterns.chain_of_responsibility;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by User1 on 05.02.2016.
 */
public interface ProjectItem extends Serializable {
    public static final String EOL_STRING =
            System.getProperty("line.separator");
    public ProjectItem getParent();
    public Contact getOwner();
    public String getDetails();
    public ArrayList getProjectItems();
}
