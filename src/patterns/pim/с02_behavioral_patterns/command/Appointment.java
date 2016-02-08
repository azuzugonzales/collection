package patterns.pim.с02_behavioral_patterns.command;

import java.util.Date;

/**
 * Created by User1 on 08.02.2016.
 */
public class Appointment {
    private String reason;
    private Contact[] contacts;
    private Location location;
    private Date startDate;
    private Date endDate;

    public Appointment(String reason, Contact[] contacts, Location location,
                       Date startDate, Date endDate) {
        this.reason = reason;
        this.contacts = contacts;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getReason() {
        return reason;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public Location getLocation() {
        return location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Appointment:" + "\n Reason: " + reason +
                "\n Location: " + location + "\n Start: " +
                startDate + "\n End: " + "\n";
    }
}
