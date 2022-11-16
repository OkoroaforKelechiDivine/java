package hackerRank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTripletsTest {

    private CompareTheTriplets compareTheTriplets;

    @BeforeEach
    public void initSetup(){
        compareTheTriplets = new CompareTheTriplets();
    }

    @Test
    public void test_thatAliceGotOnePointAtIndex0() throws Exception {
        List<Integer> aliceScore = new ArrayList<>();
        List<Integer> bobScore = new ArrayList<>();
        List<Integer> scores = new ArrayList<>();

        aliceScore.add(3);
        aliceScore.add(2);
        aliceScore.add(1);

        bobScore.add(2);
        bobScore.add(6);
        bobScore.add(1);
        scores = compareTheTriplets.compareElement(aliceScore, bobScore);
        Assertions.assertNotNull(scores);
    }
//
//    @Test
//    public void test_thatBobGotOnePointAtIndex0() throws Exception {
//        int [] aliceGrade = {2, 3, 4};
//        int [] bobGrade = {15, 56, 7};
//        int result = compareTheTriplets.compareElement(aliceGrade, bobGrade);
//        Assertions.assertEquals(result, 1);
//    }
//
//    @Test
//    public void test_thatAliceGotOnePointAtIndex1() throws Exception {
//        int [] aliceGrade = {2, 3, 4};
//        int [] bobGrade = {15, 1, 7};
//        int result = compareTheTriplets.compareElement(aliceGrade, bobGrade);
//        Assertions.assertEquals(result, 2);
//    }
//
//    @Test
//    public void test_thatBobGotOnePointAtIndex1() throws Exception {
//        int [] aliceGrade = {2, 3, 4};
//        int [] bobGrade = {15, 10, 7};
//        int result = compareTheTriplets.compareElement(aliceGrade, bobGrade);
//        Assertions.assertEquals(result, 2);
//    }
//
//    @Test
//    public void test_thatAliceGotOnePointAtIndex2() throws Exception {
//        int [] aliceGrade = {2, 3, 24};
//        int [] bobGrade = {15, 10, 7};
//        int result = compareTheTriplets.compareElement(aliceGrade, bobGrade);
//        Assertions.assertEquals(result, 3);
//    }
//
//    @Test
//    public void test_thatBobGotOnePointAtIndex2() throws Exception {
//        int [] aliceGrade = {2, 3, 4};
//        int [] bobGrade = {15, 10, 7};
//        int result = compareTheTriplets.compareElement(aliceGrade, bobGrade);
//        Assertions.assertEquals(result, 3);
//    }
//
//    @Test
//    public void test_thatBothAliceAndBobGotNoPointIfGradeIsEqual() throws Exception {
//        int [] aliceGrade = {2, 3, 7};
//        int [] bobGrade = {2, 10, 7};
//        int result = compareTheTriplets.compareElement(aliceGrade, bobGrade);
//        Assertions.assertEquals(result, 1);
//    }
}