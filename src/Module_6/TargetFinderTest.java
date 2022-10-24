package Module_6;

import java.util.Arrays;

public class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {-46, 32},
                {-41, 15},
                {-2, 45}

        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [-41, 10]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
class TargetFinder{
    private int a;
    private int b;

    public int[] findTarget(int[] aiCoords, int[][] targets){
        aiCoords[0] = a;
        aiCoords[1] = b;
        int[] result  = new int[2];

        int nearest1 = 0;
        int nearest2 = 0;

        long value = 2L *Integer.MAX_VALUE;
        for (int i = 0; i <= targets.length-1; i++) {
            for (int j = 0; j <= targets[i].length - 1; j++) {
                if (value > Math.abs(a - targets[i][0])) {
                    value = Math.abs(a - targets[i][0]);
                    nearest1 = targets[i][0];
                    result[0] = nearest1;
                    break;
                }
            }
        }
        long value1 = 2L *Integer.MAX_VALUE;
        for (int i = 0; i <= targets.length-1; i++) {
            for (int j = 0; j <= targets[i].length; j++) {
                if (value1 > Math.abs(b - targets[i][1])) {
                    value1 = Math.abs(b - targets[i][1]);
                    nearest2 = targets[i][1];
                    result[1] = nearest2;
                    break;
                }
            }
        }
        return result;
    }
}
