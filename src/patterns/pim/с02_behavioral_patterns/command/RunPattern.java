package patterns.pim.с02_behavioral_patterns.command;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by User1 on 08.02.2016.
 */
public class RunPattern {
    private static Calendar dateCreator = Calendar.getInstance();

    public static void main(String[] args) {
        System.out.println("Example for the Command pattern");
        System.out.println();
        System.out.println("t");
        System.out.println("t");
        System.out.println("t");
        System.out.println("t");
        System.out.println("t");
        System.out.println("t");
        System.out.println("t");
        System.out.println();

        System.out.println("Creating an Appointment for use in the demo");
        Contact [] people = { new ContactImpl(), new ContactImpl() };
        Appointment appointment = new Appointment("Java Twister Semi-Finals",
                people, new LocationImpl(""), createDate(2001, 10, 31, 14, 30),
                createDate(2001, 10, 31, 14, 31));

        System.out.println("Creating the ChangeLocationCommand");
        ChangeLocationCommand cmd = new ChangeLocationCommand();
        cmd.setAppointment(appointment);

        System.out.println("Creating the GUI");
        CommandGui application = new CommandGui(cmd);
        application.setAppointment(appointment);
        cmd.setLocationEditor(application);
        application.createGui();
    }

    public static Date createDate(int year, int month, int day, int hour, int minute) {
        dateCreator.set(year, month, day, hour, minute);
        return dateCreator.getTime();
    }
}
