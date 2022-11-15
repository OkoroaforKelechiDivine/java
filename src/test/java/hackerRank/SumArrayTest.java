package hackerRank;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SumArrayTest {

    private SumArray sumArray;

    @BeforeEach
    public void initSetup(){
        sumArray = new SumArray();
    }

    @Test
    @DisplayName("Sum array")
    public void test_sumArray(){
        int[] numbers = {3, 4, 5};
        int sum = sumArray.simpleArraySum(numbers);
        Assertions.assertEquals(sum, 12);
    }

    @Test
    @DisplayName("List array")
    public void test_listArray(){
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(3);
        listOfNumbers.add(5);
        listOfNumbers.add(3);
        listOfNumbers.add(1);

        int sum = sumArray.simpleListSum(listOfNumbers);
        Assertions.assertEquals(sum, 12);
    }
}