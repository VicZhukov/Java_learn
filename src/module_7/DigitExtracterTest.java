package module_7;

import java.util.Arrays;

public class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}
class DigitExtracter{
    public int[] extract(String text){
        String array = text.replaceAll("\\D+", "");

        int[] result = new int[array.length()];
        for (int i = 0; i < array.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(array.charAt(i)));
        }
        return result;
    }
}
