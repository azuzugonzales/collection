package patterns.pim.abstract_factory;

import patterns.pim.abstract_factory.Address;
import patterns.pim.abstract_factory.AddressFactory;
import patterns.pim.abstract_factory.PhoneNumber;

public class USAddressFactory implements AddressFactory {
    public Address createAddress() {
        return new USAddress();
    }

    public PhoneNumber createPhoneNumber(){
        return new USPhoneNumber();
    }
}
