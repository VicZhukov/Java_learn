package module_7;


import java.util.Arrays;

public class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}
class Phrase{
    private final String[] newWords;

    public Phrase(String[] words) {
        newWords = Arrays.copyOf(words,words.length);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= newWords.length-1; i++) {
            result.append(newWords[i]).append(" ");
        }
        return result.toString();
    }
}
