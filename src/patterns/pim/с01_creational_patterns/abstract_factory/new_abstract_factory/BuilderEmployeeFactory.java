package patterns.pim.с01_creational_patterns.abstract_factory.new_abstract_factory;

/**
 * Created by Azuzu on 05.02.2016.
 */
public class BuilderEmployeeFactory implements EmployeeFactory {

    public Employee createEmployee() {
        return new BuilderEmployee();
    }

    public Solary createSolary() {
        return new BuilderSolary();
    }

}
