package hackerRank;

public class CompareTheTriplets {

    public int compareElement(int[] aliceGrade, int[] bobGrade) throws Exception {

        int gradePoint = 0;

        if (aliceGrade.length != 3 && bobGrade.length != 3){
            throw new Exception("Grade length has to be 3");
        }

        if (aliceGrade[0] > bobGrade[0]){
            gradePoint = gradePoint + 1;
        }

        if (bobGrade[0] > aliceGrade[0]){
            gradePoint = gradePoint + 1;
        }
        return gradePoint;
    }
}
