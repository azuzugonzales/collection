package patterns.pim.с01_creational_patterns.abstract_factory;

public class FrenchPhoneNumber extends PhoneNumber {
    private static final String COUNTRY_CODE = "33";
    private static final int NUMBER_LENGTH = 9;

    public String getCountryCode() {
        return COUNTRY_CODE;
    }

    public void setPhoneNumber(String newNumber) {
        if (newNumber.length() == NUMBER_LENGTH) {
            super.setPhoneNumber(newNumber);
        }
    }
}
