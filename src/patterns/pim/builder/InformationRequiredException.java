package patterns.pim.builder;

public class InformationRequiredException extends Exception{
    private static final String MESSAGE = "Appointment cannot be created" +
            "because further information is required";
    public static final int START_DATE_REQUARED = 1;
    public static final int END_DATE_REQUARED = 2;
    public static final int DESCRIPTION_REQUARED = 4;
    public static final int ATTENDEE_REQUARED = 8;
    public static final int LOCATION_REQUARED = 16;
    private int informationRequired;

    public InformationRequiredException(int itemsRequired){
        super(MESSAGE);
        informationRequired = itemsRequired;
    }

    public int getInformationRequired(){
        return informationRequired;
    }
}
