package patterns.pim.с01_creational_patterns.abstract_factory.new_abstract_factory;

/**
 * Created by Azuzu on 05.02.2016.
 */
public abstract class Solary {
    private String solary;
    public abstract String getFullSolary();

    public String getSolary() {
        return solary;
    }

    public void setSolary(String newSolary) {
        try {
            Long.parseLong(newSolary);
            solary = newSolary;
        } catch (NumberFormatException exc) {

        }
    }
}
