package patterns.pim.с01_creational_patterns.abstract_factory.new_abstract_factory;

/**
 * Created by Azuzu on 05.02.2016.
 */
public class BuilderSolary extends Solary {
    private static final String WORKING_CODE = "001";
    private static final int NUMBER_LENGTH = 5;

    public String getWorkingCode() {
        return WORKING_CODE;
    }

    public void setNumberLength(String newNumber) {
        if (newNumber.length() == NUMBER_LENGTH) {
            super.setSolary(newNumber);
        }
    }

    @Override
    public String getFullSolary() {
        return null;
    }
}
