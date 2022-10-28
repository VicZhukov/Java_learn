package Module_7;

public class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("pufyil rug yno Eviwfezaygj syleordidoy iphoavlox kypeudb Eviwfezaygj meo hycubapyra", "Eviwfezaygj"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}
class WordFreqCounter{
    public float countFreq(String phrase, String word){
        phrase = phrase.toLowerCase();
        word = word.toLowerCase();
        float buff = (float) (phrase.length() - phrase.replace(word, "").length()) / word.length();
        float counter = phrase.split(" ").length;

        return buff / counter;
    }
}
