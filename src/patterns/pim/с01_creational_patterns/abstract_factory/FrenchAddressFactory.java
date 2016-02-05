package patterns.pim.с01_creational_patterns.abstract_factory;

public class FrenchAddressFactory implements AddressFactory {
    public Address createAddress(){
        return new FrenchAddress();
    }
    public PhoneNumber createPhoneNumber(){
        return new FrenchPhoneNumber();
    }
}
