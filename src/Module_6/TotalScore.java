package Module_6;

public class TotalScore {
    public int sum(int[] scores) {
        int result = 0;
        int index = 0;

        /*while(true) {
            try {
                result += scores[index++];
            } catch (IndexOutOfBoundsException ex) {
                break;
            }
        }*/
        for (int i = 0; i <= scores.length-1; i++) {
            result += scores[i];
        }

        return result;
    }
}
class TotalScoreTest {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore().sum(score));
    }
}
