package patterns.pim.с02_behavioral_patterns.command;

import java.io.Serializable;

/**
 * Created by User1 on 08.02.2016.
 */
public interface Contact extends Serializable {
    public static final String SPACE = " ";
    public String getFirstName();
    public String getLastName();
    public String getTitle();
    public String getOrganization();

    public void setFirstName(String newFirstName);
    public void setLastName(String newLastName);
    public void setTitle(String newTitle);
    public void setOrganization(String newOrganization);
}
