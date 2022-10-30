package Module_7;

public class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pas: swordfish"));
    }
}
class SensitiveDataSearcher{
    public boolean isSensitiveDataPresent(String phrase){
        String[] buff = new String[] {"pass", "key", "login", "email"};
        phrase = phrase.toLowerCase();
        for (String word : buff){
            if (phrase.contains(word)){
                return true;
            }
        }
        return false;
    }
}
