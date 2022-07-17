package problems.test.easy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import problems.easy.TwoSumSolution;

import static org.junit.Assert.assertEquals;

public class TwoSumSolutionTest {
    private TwoSumSolution solution;

    @Before
    public void setup() {
        solution = new TwoSumSolution();
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Test
    public void twoSumOnePassHashMapInvalidConstraintCase1() {
        assertEquals(0, solution.twoSumOnePassHashMapTable(new int[]{1}, 9).length);
    }

    @Test
    public void twoSumOnePassHashMapInvalidConstraintCase2() {
        int[] expectedArray = new int[Integer.valueOf((int) (Math.pow(10, 4) + 1))];
        assertEquals(0, solution.twoSumOnePassHashMapTable(expectedArray, 9).length);
    }

    @Test
    public void twoSumOnePassHashMapInvalidConstraintCase3() {
        assertEquals(0, solution.twoSumOnePassHashMapTable(new int[]{1, 2}, (int) Math.pow(10, -10)).length);
    }

    @Test
    public void twoSumOnePassHashMapInvalidConstraintCase4() {
        assertEquals(0, solution.twoSumOnePassHashMapTable(new int[]{1, 2}, (int) Math.pow(10, 10)).length);
    }

    @Test
    public void twoSumOnePassHashMapInvalidConstraintCase5() {
        assertEquals(0, solution.twoSumOnePassHashMapTable(new int[]{2, (int) Math.pow(10, -10)}, 9).length);
    }

    @Test
    public void twoSumOnePassHashMapInvalidConstraintCase6() {
        assertEquals(0, solution.twoSumOnePassHashMapTable(new int[]{2, (int) Math.pow(10, 10)}, 9).length);
    }

    @Test
    public void twoSumOnePassHashMapTestCase1() {
        int[] expectedResult = new int[]{0, 1};
        int[] actualResult = solution.twoSumOnePassHashMapTable(new int[]{2, 7, 11, 15}, 9);

        assertEquals(expectedResult[0], actualResult[0]);
        assertEquals(expectedResult[1], actualResult[1]);
    }

    @Test
    public void twoSumOnePassHashMapTestCase2() {
        int[] expectedResult = new int[]{1, 2};
        int[] actualResult = solution.twoSumOnePassHashMapTable(new int[]{3, 2, 4}, 6);

        assertEquals(expectedResult[0], actualResult[0]);
        assertEquals(expectedResult[1], actualResult[1]);
    }

    @Test
    public void twoSumOnePassHashMapTestCase3() {
        int[] expectedResult = new int[]{0, 1};
        int[] actualResult = solution.twoSumOnePassHashMapTable(new int[]{3, 3}, 6);

        assertEquals(expectedResult[0], actualResult[0]);
        assertEquals(expectedResult[1], actualResult[1]);
    }

    @Test
    public void twoSumWith2LoopsInvalidConstraintCase1() {
        assertEquals(0, solution.twoSumWith2Loops(new int[]{1}, 9).length);
    }

    @Test
    public void twoSumWith2LoopsInvalidConstraintCase2() {
        int[] expectedArray = new int[Integer.valueOf((int) (Math.pow(10, 4) + 1))];
        assertEquals(0, solution.twoSumWith2Loops(expectedArray, 9).length);
    }

    @Test
    public void twoSumWith2LoopsInvalidConstraintCase3() {
        assertEquals(0, solution.twoSumWith2Loops(new int[]{1, 2}, (int) Math.pow(10, -10)).length);
    }

    @Test
    public void twoSumWith2LoopsInvalidConstraintCase4() {
        assertEquals(0, solution.twoSumWith2Loops(new int[]{1, 2}, (int) Math.pow(10, 10)).length);
    }

    @Test
    public void twoSumWith2LoopsInvalidConstraintCase5() {
        assertEquals(0, solution.twoSumWith2Loops(new int[]{2, (int) Math.pow(10, -10)}, 9).length);
    }

    @Test
    public void twoSumWith2LoopsInvalidConstraintCase6() {
        assertEquals(0, solution.twoSumWith2Loops(new int[]{2, (int) Math.pow(10, 10)}, 9).length);
    }

    @Test
    public void twoSumWith2LoopsTestCase1() {
        int[] expectedResult = new int[] {0, 1};
        int[] actualResult = solution.twoSumWith2Loops(new int[] {2, 7, 11, 15}, 9);

        assertEquals(expectedResult[0], actualResult[0]);
        assertEquals(expectedResult[1], actualResult[1]);
    }

    @Test
    public void twoSumWith2LoopsTestCase2() {
        int[] expectedResult = new int[] {1, 2};
        int[] actualResult = solution.twoSumWith2Loops(new int[] {3,2,4}, 6);

        assertEquals(expectedResult[0], actualResult[0]);
        assertEquals(expectedResult[1], actualResult[1]);
    }

    @Test
    public void twoSumWith2LoopsTestCase3() {
        int[] expectedResult = new int[] {0, 1};
        int[] actualResult = solution.twoSumWith2Loops(new int[] {3,3}, 6);

        assertEquals(expectedResult[0], actualResult[0]);
        assertEquals(expectedResult[1], actualResult[1]);
    }
}
