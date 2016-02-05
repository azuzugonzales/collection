package patterns.pim.с01_creational_patterns.abstract_factory;

public abstract class PhoneNumber {
    private String phoneNumber;
    public abstract String getCountryCode();

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String newNumber) {
        try {
            Long.parseLong(newNumber);
            phoneNumber = newNumber;
        } catch (NumberFormatException exc) {

        }
    }
}
