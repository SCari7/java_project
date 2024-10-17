package classwork_25.regex_valodator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
//RegexValidator validator;
    @BeforeEach
    void setUp() {
//        validator =  new RegexValidator;

    }

    @Test
    void checkCreditCardNumber() {
        assertTrue(Validator.checkCreditCardNumber("12345678")); // 8 digits
        assertTrue(Validator.checkCreditCardNumber("1234567887654321")); // 16 digits
        assertTrue(Validator.checkCreditCardNumber("1234567890"));// 10 digit
        assertFalse(Validator.checkCreditCardNumber("1234567")); // 7 digit
        assertFalse(Validator.checkCreditCardNumber("12345678876543210")); // 17 digits
        assertFalse(Validator.checkCreditCardNumber("12345678A")); // symbol
    }

    @Test
    void checkDateFormatEU() {
        assertTrue(Validator.checkDateFormatEU("05.12.1996"));
        assertTrue(Validator.checkDateFormatEU("05.10.2023"));
        assertTrue(Validator.checkDateFormatEU("31.02.2023"));
        assertFalse(Validator.checkDateFormatEU("32.02.2023"));
        assertFalse(Validator.checkDateFormatEU("15.13.2023"));
        assertFalse(Validator.checkDateFormatEU("26/02/2023"));
        assertFalse(Validator.checkDateFormatEU("5.10.2023"));

    }

    @Test
    void checkDateFormatUS() {
        assertTrue(Validator.checkDateFormatEU("2022-12-05"));
        assertTrue(Validator.checkDateFormatEU("2000-01-01"));
        assertTrue(Validator.checkDateFormatEU("2001-12-12"));
        assertFalse(Validator.checkDateFormatEU("2023-02-32"));
        assertFalse(Validator.checkDateFormatEU("2023-14-07"));
        assertFalse(Validator.checkDateFormatEU("2023/02/02"));
        assertFalse(Validator.checkDateFormatEU("2023.10.2"));



    }

    @Test
    void checkPhoneNumber() {
        assertTrue(Validator.checkPhoneNumber("+08(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("08(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+108(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+8(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+08(1)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+08(01)123-5678"));
        assertFalse(Validator.checkPhoneNumber("+08(01)1234-56789"));
    }

    @Test
    void checkLessEquals255() {
    }
}