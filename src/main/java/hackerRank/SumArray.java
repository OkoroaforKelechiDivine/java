package hackerRank;

import java.util.List;

public class SumArray {

    public int simpleArraySum(int[] numberArray){
        int result = 0;

        for (int index : numberArray) {
            result = result + index;
        }
        return result;
    }

    public int simpleListSum(List<Integer> listArray){
        int result = 0;

        for (int index :  listArray){
            result = result + index;
        }
        return result;
    }
}
