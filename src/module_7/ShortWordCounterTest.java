package module_7;

import java.util.ArrayList;

public class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}
class ShortWordCounter{
    public int count(String phrase, int minLength){
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
        String[] buff = tmp.toArray(new String[0]);

        int counter = 0;
        for (int j = 0; j <= buff.length-1; j++) {
            if(buff[j].length() <= minLength){
                counter++;
            }
        }
        return counter;
    }
}
