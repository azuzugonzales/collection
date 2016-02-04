package exception.area;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Area {
    public static void main(String[] args) {

        int result;

        try {
            result = getAreaValue(-5, 100);
        } catch (IllegalArgumentException e) {
            Logger.getLogger(Area.class.getName()).log(new LogRecord(Level.WARNING, "In method negative value"));

            throw e;
        }
        System.out.println("Result is: " + result);
    }

    public static int getAreaValue(int x, int y) {
        if (x < 0 || y < 0) throw new IllegalArgumentException("" +
                "value of 'x' or 'y' is negative: x = " + x
                +", y = " + y);
        return x * y;
    }
}
