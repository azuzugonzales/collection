package patterns.pim.с01_creational_patterns.builder;

public class LocationImpl implements Location{
    private String location;

    public LocationImpl() {}

    public LocationImpl(String newLocation){
        location = newLocation;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String newLocation){
        location = newLocation;
    }

    @Override
    public String toString() {
        return location;
    }
}
