package module_7;

public class PhraseMaker {
    public String join(String[] words) {
        StringBuilder result = new StringBuilder();
        for(String i : words){
            if(i.length() > 3){
                i = i.toLowerCase();
            }else i = i.toUpperCase();
            result.append(i).append(" ");
        }
        return result.toString().strip();
    }
}
class PhraseMakerTest {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));
    }
}
