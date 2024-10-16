package homework_22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
    Address address;
   final String city = "Altenburg";
   final String postalCode = "04600";

    @BeforeEach
    void setUp() {
        address = new Address(city, postalCode);
        assertEquals("Altenburg", address.getCity());
        assertEquals("04600", address.getPostalCode());
    }
    @Test
    void validAddress (){
        Address address = new Address("Altenburg", "04600");
        assertEquals("Altenburg", address.getCity());
        assertEquals("04600", address.getPostalCode());
    }

}