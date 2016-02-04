package patterns.pim.abstract_factory;


public interface AddressFactory {
    public Address createAddress();
    public PhoneNumber createPhoneNumber();
}
