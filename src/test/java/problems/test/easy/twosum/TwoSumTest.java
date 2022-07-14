package problems.test.easy.twosum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        assertNull(problem.twoSum(new int[]{1,2}, (int) Math.pow(10, -10)));
    }

    @Test
    public void invalidConstraintCase4() {
        assertNull(problem.twoSum(new int[]{1, 2}, (int) Math.pow(10, 10)));
    }
}
