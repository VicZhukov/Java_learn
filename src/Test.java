//import java.util.Arrays;
//
//public class Test {
//    public static void main(String[] args) {
//        String s = "april 5, year 2000";
//
//        char[] chars = s.toCharArray();
//        char[] numbers = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
//
//        int charsCounter = 0;
//        for(char i : chars){
//            for(char j : numbers){
//                if(i == j){
//                    charsCounter++;
//                }
//            }
//        }
//
//        int[] result = new int[charsCounter];
//        int counter = 0;
//        for(char i : chars){
//            for(char j : numbers){
//                if(i == j){
//                    result[counter] = i;
//                    counter++;
//                }
//            }
//        }
//        System.out.println(charsCounter);
//        System.out.println(Arrays.toString(result));
//
//    }
//}
//
