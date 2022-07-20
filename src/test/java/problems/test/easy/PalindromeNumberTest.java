package problems.test.easy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import problems.easy.PalindromeNumber;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PalindromeNumberTest {
    private PalindromeNumber palindromeNumber;

    @Before
    public void setup() {
        palindromeNumber = new PalindromeNumber();
    }

    @After
    public void tearDown() {
        palindromeNumber = null;
    }

    @Test
    public void testInputLessThanMinus231() {
        assertFalse(palindromeNumber.isPalindrome(-232));
    }

    @Test
    public void testInputGreaterThan230() {
        assertFalse(palindromeNumber.isPalindrome(231));
    }

    @Test
    public void testCase1() {
        assertTrue(palindromeNumber.isPalindrome(121));
    }

    @Test
    public void testCase2() {
        assertFalse(palindromeNumber.isPalindrome(-121));
    }

    @Test
    public void testCase3() {
        assertFalse(palindromeNumber.isPalindrome(10));
    }
}
