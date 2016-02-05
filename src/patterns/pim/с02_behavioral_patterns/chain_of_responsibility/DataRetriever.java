package patterns.pim.с02_behavioral_patterns.chain_of_responsibility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by User1 on 05.02.2016.
 */
public class DataRetriever {
    public static Object deserialiseData(String fileName) {
        Object returnValue = null;
        try {
            File inputFile = new File(fileName);
            if (inputFile.exists() && inputFile.isFile()) {
                ObjectInputStream readIn = new ObjectInputStream(new FileInputStream(fileName));
                returnValue = readIn.readObject();
                readIn.close();
            } else {
                System.err.println("Unable to locale the file " + fileName);
            }
        } catch (ClassNotFoundException exc) {
            exc.printStackTrace();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
        return returnValue;
    }
}
