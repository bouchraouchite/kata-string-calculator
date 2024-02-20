package fr.norsys.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClazzTest {

    @Test
    public void testAddEmptyString() {
        Clazz clazz = new Clazz();
        int result = clazz.add("");
        assertEquals(0, result);
    }

    @Test
    public void testAddSingleNumber() {
        Clazz clazz = new Clazz();
        int result = clazz.add("5");
        assertEquals(5, result);
    }

    @Test
    public void testAddTwoNumbers() {
        Clazz clazz = new Clazz();
        int result = clazz.add("5,3");
        assertEquals(8, result);
    }

    @Test
    public void testAddNewLineDelimiter() {
        Clazz clazz = new Clazz();
        int result = clazz.add("1\n2,3");
        assertEquals(6, result);
    }

    @Test
    public void testAddIgnoreNumbersGreaterThan1000() {
        Clazz clazz = new Clazz();
        int result = clazz.add("2,1001");
        assertEquals(2, result);
    }

    @Test
    public void testAddNegativeNumber() {
        Clazz clazz = new Clazz();
        assertThrows(IllegalArgumentException.class, () -> {
            clazz.add("-2,3");
        });
    }
}
