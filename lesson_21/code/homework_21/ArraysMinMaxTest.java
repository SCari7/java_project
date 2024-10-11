package homework_21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysMinMaxTest {
    int[] array;

    @BeforeEach
    void setUp() {
        array = new int[]{2, 4, -5, 7};

    }

    @Test
    void testFindMin() {
        assertEquals(-5, ArraysMinMax.findMin(array));
    }

    @Test
    void testFindMax() {
        assertEquals(7,ArraysMinMax.findMax(array));
    }

//    @Test
//    void testFindMinIndex() {
//        assertEquals(, ArraysMinMax.findMinIndex(array));
//    }
//
//    @Test
//    void testFindMaxIndex() {
//        assertEquals(,ArraysMinMax.findMaxIndex(array));
//    }

    @Test
    void test() {
        assertEquals(-5,  ArraysMinMax.findMin(new int[]{2, 4, -5, 7}));
    }

    @Test
    void name() {
        assertEquals(7, ArraysMinMax.findMax(new int[]{2, 4, -5, 7}));
    }
}