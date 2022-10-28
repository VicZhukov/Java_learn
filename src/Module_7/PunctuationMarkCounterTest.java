package Module_7;

public class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
class PunctuationMarkCounter{
    public int count(String phrase){
        int counter = 0;
        char[] result = phrase.toCharArray();
        for (int i = 0; i <= result.length-1; i++) {
            if(result[i] == ',' || result[i] == '.' || result[i] == '!' || result[i] == ':' || result[i] == ';'){
                counter++;
            }
        }
        return counter;
    }
}
