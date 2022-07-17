package problems.test.medium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import problems.medium.LongestSubstringWithoutRepeatingCharacters;

import static junit.framework.TestCase.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {
    private LongestSubstringWithoutRepeatingCharacters solution;

    @Before
    public void setup() {
        solution = new LongestSubstringWithoutRepeatingCharacters();
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Test
    public void testCase1() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testCase2() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void testCase3() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testCase4() {
        assertEquals(2, solution.lengthOfLongestSubstring("aab"));
    }

    @Test
    public void testCase5() {
        assertEquals(5, solution.lengthOfLongestSubstring("qrsvbspk"));
    }

    @Test
    public void testCase6() {
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
    }
}
