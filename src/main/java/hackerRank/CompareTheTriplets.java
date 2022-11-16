package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CompareTheTriplets {

    public List<Integer> compareElement(List<Integer> aliceGrade, List<Integer> bobGrade) throws Exception {

//        A score list that will store Alice and Bob's score
        List<Integer> scores = new ArrayList<>();

        int aliceScore = 0;
        int bobScore = 0;

//        I will use Alice's score size to determine Bob's score size too!
        for (int index = 0; index < aliceGrade.size(); index++){
            if(aliceGrade.get(index) > bobGrade.get(index)){
                aliceScore += 1;
            }
            if (Objects.equals(aliceGrade.get(index), bobGrade.get(index))){
                System.out.println("Can not grade this two grade at: " + aliceGrade.get(index) + " and " + bobGrade.get(index));
            }
            else if(bobGrade.get(index) > aliceGrade.get(index)) {
                bobScore += 1;
            }
        }
        scores.add(aliceScore);
        scores.add(bobScore);

        return scores;
    }
}
