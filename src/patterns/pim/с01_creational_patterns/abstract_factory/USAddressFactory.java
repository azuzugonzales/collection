package patterns.pim.с01_creational_patterns.abstract_factory;

public class USAddressFactory implements AddressFactory {
    public Address createAddress() {
        return new USAddress();
    }

    public PhoneNumber createPhoneNumber(){
        return new USPhoneNumber();
    }
}
