package problems.test.easy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import problems.easy.RomanToInteger;

import static junit.framework.TestCase.*;

public class RomanToIntegerTest {
    private RomanToInteger solution;

    @Before
    public void setup() {
        solution = new RomanToInteger();
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Test
    public void testStringLengthLessThan1() {
        assertFalse(solution.isValidInput(""));
    }

    @Test
    public void testStringLengthGreaterThan15() {
        assertFalse(solution.isValidInput("IVXLCDMIVXLCDMIVX"));
    }

    @Test
    public void testInvalidCharacter() {
        assertFalse(solution.isValidInput("A"));
    }

    @Test
    public void testValidCharacter() {
        assertTrue(solution.isValidInput("III"));
    }

    @Test
    public void testValidOutput() {
        assertTrue(solution.isValidOutput(10));
    }

    @Test
    public void testOutputIs4000() {
        assertFalse(solution.isValidOutput(4000));
    }

    @Test
    public void testOutputIs0() {
        assertFalse(solution.isValidOutput(0));
    }

    @Test
    public void testOutputIs3() {
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    public void testOutputIs58() {
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    public void testOutputIs1994() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }

    @Test
    public void testOutputIs4() {
        assertEquals(4, solution.romanToInt("IV"));
    }

    @Test
    public void testOutputIs1() {
        assertEquals(1, solution.romanToInt("I"));
    }

    @Test
    public void testOutputIsMinus1() {
        assertEquals(-1, solution.romanToInt("A"));
    }
}
