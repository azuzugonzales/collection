package patterns.pim.с01_creational_patterns.abstract_factory;


public interface AddressFactory {
    public Address createAddress();
    public PhoneNumber createPhoneNumber();
}
