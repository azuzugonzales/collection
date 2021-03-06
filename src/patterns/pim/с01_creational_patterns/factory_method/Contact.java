package patterns.pim.с01_creational_patterns.factory_method;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

/**
 * Created by Azuzu on 04.02.2016.
 */
public class Contact implements Editable, Serializable {
    private String name;
    private String relationship;

    @Override
    public ItemEditor getEditor() {
        return new ContactEditor();
    }

    private class ContactEditor implements ItemEditor, Serializable {
        private transient JPanel panel;
        private transient JTextField nameField;
        private transient JTextField relationField;

        public JComponent getGUI() {
            if (panel == null) {
                panel = new JPanel();
                nameField = new JTextField(name);
                relationField = new JTextField(relationship);
                panel.setLayout(new GridLayout(2, 2));
                panel.add(new JLabel("Name:"));
                panel.add(nameField);
                panel.add(new JLabel("Relationship:"));
                panel.add(relationField);
            } else {
                nameField.setText(name);
                relationField.setText(relationship);
            }
            return panel;
        }

        public void commitChanges() {
            if (panel != null) {
                name = nameField.getText();
                relationship = relationField.getText();
            }
        }

        @Override
        public String toString() {
            return "\nContact:\n" +
                    " Name: " + name + "\n" +
                    " Relationship: " + relationship;
        }
    }
}
