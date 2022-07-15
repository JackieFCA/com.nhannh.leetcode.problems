package problems.test.easy.twosum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import problems.easy.twosum.TwoSum;

public class TwoSumTest {
    private TwoSum problem;

    @Before
    public void setup() {
        problem = new TwoSum();
    }

    @After
    public void tearDown() {
        problem = null;
    }

    @Test
    public void invalidConstraintCase1() {
        assertNull(problem.twoSum(new int[]{1}, 9));
    }

    @Test
    public void invalidConstraintCase2() {
        int[] expectedArray = new int[Integer.valueOf((int) (Math.pow(10, 4) + 1))];
        assertNull(problem.twoSum(expectedArray, 9));
    }

    @Test
    public void invalidConstraintCase3() {
        assertNull(problem.twoSum(new int[]{1, 2}, (int) Math.pow(10, -10)));
    }

    @Test
    public void invalidConstraintCase4() {
        assertNull(problem.twoSum(new int[]{1, 2}, (int) Math.pow(10, 10)));
    }

    @Test
    public void testCase1() {
        int[] expectedResult = new int[] {0, 1};
        int[] actualResult = problem.twoSum(new int[] {2, 7, 11, 15}, 9);

        assertEquals(expectedResult[0], actualResult[0]);
        assertEquals(expectedResult[1], actualResult[1]);
    }

    @Test
    public void testCase2() {
        int[] expectedResult = new int[] {1, 2};
        int[] actualResult = problem.twoSum(new int[] {3,2,4}, 6);

        assertEquals(expectedResult[0], actualResult[0]);
        assertEquals(expectedResult[1], actualResult[1]);
    }

    @Test
    public void testCase3() {
        int[] expectedResult = new int[] {0, 1};
        int[] actualResult = problem.twoSum(new int[] {3,3}, 6);

        assertEquals(expectedResult[0], actualResult[0]);
        assertEquals(expectedResult[1], actualResult[1]);
    }
}
