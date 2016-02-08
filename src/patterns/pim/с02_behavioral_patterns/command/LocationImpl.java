package patterns.pim.с02_behavioral_patterns.command;

/**
 * Created by User1 on 08.02.2016.
 */
public class LocationImpl implements Location {
    private String location;

    public LocationImpl() {}

    public LocationImpl(String newLocation) {
        location = newLocation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String newLocation) {
        location = newLocation;
    }

    public String toString() {
        return location;
    }
}
