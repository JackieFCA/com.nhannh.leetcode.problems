package problems.test.easy.twosum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import problems.easy.twosum.TwoSumWith2Loops;

import static org.junit.Assert.assertEquals;

public class TwoSumWith2LoopsTest {
    private TwoSumWith2Loops problem;

    @Before
    public void setup() {
        problem = new TwoSumWith2Loops();
    }

    @After
    public void tearDown() {
        problem = null;
    }

    @Test
    public void invalidConstraintCase1() {
        assertEquals(0, problem.twoSum(new int[]{1}, 9).length);
    }

    @Test
    public void invalidConstraintCase2() {
        int[] expectedArray = new int[Integer.valueOf((int) (Math.pow(10, 4) + 1))];
        assertEquals(0, problem.twoSum(expectedArray, 9).length);
    }

    @Test
    public void invalidConstraintCase3() {
        assertEquals(0, problem.twoSum(new int[]{1, 2}, (int) Math.pow(10, -10)).length);
    }

    @Test
    public void invalidConstraintCase4() {
        assertEquals(0, problem.twoSum(new int[]{1, 2}, (int) Math.pow(10, 10)).length);
    }

    @Test
    public void invalidConstraintCase5() {
        assertEquals(0, problem.twoSum(new int[]{2, (int) Math.pow(10, -10)}, 9).length);
    }

    @Test
    public void invalidConstraintCase6() {
        assertEquals(0, problem.twoSum(new int[]{2, (int) Math.pow(10, 10)}, 9).length);
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
