package patterns.pim.factory_method;

/**
 * Created by Azuzu on 04.02.2016.
 */
public class RunPattern {
    public static void main(String[] args) {
        System.out.println("######");

        Contact someone = new Contact();
        System.out.println("Creating");
        System.out.println();
        System.out.println("text");
        System.out.println("text");
        System.out.println("text");
        System.out.println("text");
        System.out.println("text");
        System.out.println();
        System.out.println("text");
        System.out.println("text");
        System.out.println("text");

        EditorGui runner = new EditorGui(someone.getEditor());
        runner.createGui();
    }
}
