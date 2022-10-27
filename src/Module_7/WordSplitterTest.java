package Module_7;

import java.util.ArrayList;
import java.util.Arrays;

public class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("This is Sparta");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}
class WordSplitter{
    public String[] split(String phrase){
        phrase = phrase.toLowerCase();

        ArrayList<String> words = new ArrayList<>();

        StringBuilder currentWord = new StringBuilder();
        for(Character letter : phrase.toCharArray()){
            if(letter.equals(' ')){
                if(currentWord.length() > 0){
                    words.add(currentWord.toString());
                    currentWord = new StringBuilder();
                }
            } else{
                currentWord.append(letter);
            }
        }
        if(currentWord.length() > 0){
            words.add(currentWord.toString());
        }

        return words.toArray(String[]::new);
    }
}
