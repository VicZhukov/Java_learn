package Module_7;

public class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
class UniqueCharCounter{
    public int count(String phrase){
        int counter = 0;
        char[] result = phrase.toCharArray();
        for(int i = 0; i < result.length-1; i++){
            for (int j = i + 1; j < result.length; j++){
                if(result[i] == result[j]){
                    counter++;
                }
            }
        }
        return result.length - counter;
    }
}
