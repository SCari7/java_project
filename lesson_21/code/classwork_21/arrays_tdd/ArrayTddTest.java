package classwork_21.arrays_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTddTest {
    ArrayTdd arrayTdd;
    int[] array = {10, -10, 20, -15, 45, 23,};


    @BeforeEach
    void setUp() {
       // int[] array = {10, 20, -10, 45, -15};
        arrayTdd = new ArrayTdd(array);

    }

    @Test
    void countPositive() {
        //int[] array = {10, 20, -10, 45, -15};

        //expected
        int count = 4;
        //actual
        int expected = arrayTdd.countPositive(array);

        assertEquals(count, expected,"Bad info");

    }


}