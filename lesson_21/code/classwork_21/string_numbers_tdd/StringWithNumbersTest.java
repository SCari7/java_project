package classwork_21.string_numbers_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringWithNumbersTest {
    StringWithNumbers stringWithNumbers;// object  test

    @BeforeEach
    void setUp() {
        stringWithNumbers = new StringWithNumbers("123 321 10");//454
    }

    @Test
    void sumOfNumbersInStringTest(){
        String string = "1 3 3 2";
        int expected = 9;
        int actual = stringWithNumbers.sumOfNumbersInString(string);
        assertEquals(expected, actual);
    }
}