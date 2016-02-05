package patterns.pim.с01_creational_patterns.prototype;

/**
 * Created by User1 on 05.02.2016.
 */
public class RunPattern {
    public static void main(String[] args) {
        System.out.println("# Example for prototype pattern #");
        System.out.println();
        System.out.println("This example will create an Address object,");
        System.out.println(" which it will then duplicate by calling the ");
        System.out.println(" object's clone method.");
        System.out.println();

        System.out.println("Creating first address.");
        Address address1 = new Address("8445 Silverado Trail", "Rutherford", "CA", "91734");
        System.out.println("First address created.");
        System.out.println(" Hash code = " + address1.hashCode());
        System.out.println(address1);
        System.out.println();

        System.out.println("Creating second address using the clone() method.");
        Address address2 = (Address)address1.copy();
        System.out.println("Second address created.");
        System.out.println(" Hash code = " + address2.hashCode());
        System.out.println(address2);
        System.out.println();
    }
}
