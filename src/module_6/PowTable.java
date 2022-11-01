package module_6;

import java.util.Arrays;

public class PowTable {
    public static final int[] POWERS_2 = new int[10];

    static{
        int a = 1;
        for (int i = 0; i <= POWERS_2.length-1; i++) {
            POWERS_2[i] = a * a;
            a++;
        }
    }
}
class PowTableTest {
    public static void main(String[] args) {
        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}
