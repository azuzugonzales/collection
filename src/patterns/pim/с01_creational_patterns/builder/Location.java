package patterns.pim.с01_creational_patterns.builder;

import java.io.Serializable;

public interface Location extends Serializable {
    public String getLocation();
    public void setLocation(String newLocation);
}
