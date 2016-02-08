package patterns.pim.с02_behavioral_patterns.command;

import java.io.Serializable;

/**
 * Created by User1 on 08.02.2016.
 */
public interface Location extends Serializable {
    public String getLocation();
    public void setLocation(String newLocation);
}
