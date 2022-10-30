package Module_7;

public class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}
class WordCombine{
    public boolean canCombine(String sourceWord, String targetWord){
        sourceWord = sourceWord.toLowerCase();
        targetWord = targetWord.toLowerCase();
        char[] source = sourceWord.toCharArray();
        char[] target = targetWord.toCharArray();

        for(char i : source){
            for(char j : target){
                if (i == j){
                    return true;
                }
            }
        }
        return false;
    }
}
