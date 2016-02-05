package patterns.pim.с01_creational_patterns.factory_method;

import javax.swing.JComponent;

/**
 * Created by Azuzu on 04.02.2016.
 */
public interface ItemEditor {
    public JComponent getGUI();
    public void commitChanges();

}
