package hackerRank;

import java.util.List;

public class SumArray {

    public int simpleArraySum(int[] numberArray){
        int result = 0;

        for (int index : numberArray) {
            result = result + index;
            System.out.println("The sum of the array is: " + result);
        }
        return result;
    }

    public int simpleListSum(List<Integer> ar){
        int result = 0;

        for (int index :  ar){
            result = result + index;
        }
        return result;
    }
}
