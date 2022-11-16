package hackerRank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompareTheTripletsTest {

    private CompareTheTriplets compareTheTriplets;

    @BeforeEach
    public void initSetup(){
        compareTheTriplets = new CompareTheTriplets();
    }

    @Test
    public void test_thatAliceGotOnePointAtIndex0() throws Exception {
        int [] aliceGrade = {4, 3, 4};
        int [] bobGrade = {1, 56, 7};
        int result = compareTheTriplets.compareElement(aliceGrade, bobGrade);
        Assertions.assertEquals(result, 1);
    }

}