package patterns.pim.с01_creational_patterns.abstract_factory.new_abstract_factory;

/**
 * Created by Azuzu on 05.02.2016.
 */
public class RunPattern {
    public static void main(String[] args) {

        System.out.println("# START PROGRAM #");

        EmployeeFactory builderEmployeeFactory = new BuilderEmployeeFactory();
        Employee builderEmployee = builderEmployeeFactory.createEmployee();
        Solary builderSolary = builderEmployeeFactory.createSolary();

        builderEmployee.setManager("Manager-1");
        builderEmployee.setQualityControl("QA_1");
        builderEmployee.setAnalyst("analyst_1");

        System.out.println("Builder Employee: ");
        System.out.println(builderEmployee.getAllEmployee());
        System.out.println("Builder Solary");
       // builderSolary(builderEmployee.getSolary());
    }
}
