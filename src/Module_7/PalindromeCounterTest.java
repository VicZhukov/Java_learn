package Module_7;

import java.util.ArrayList;

public class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}
class PalindromeCounter{
    public int count(String phrase){
        phrase = phrase.toLowerCase();

        ArrayList<String> tmp = new ArrayList<>();

        int i = 0;
        for (int j = 0; j < phrase.length(); j++) {
            if (phrase.charAt(j) == ' ') {
                if (j > i) {
                    tmp.add(phrase.substring(i, j));
                }
                i = j + 1;
            }
        }
        if (i < phrase.length()) {
            tmp.add(phrase.substring(i));
        }
        String[] buff =  tmp.toArray(new String[0]);

        int counter = 0;
        for (int j = 0; j <= buff.length-1; j++) {
            if(buff[j].equals(new StringBuilder(buff[j]).reverse().toString())){
                counter++;
            }
        }
        return counter;
    }
}
