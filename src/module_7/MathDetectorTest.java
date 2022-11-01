package module_7;

public class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}
class MathDetector{
    public boolean isMath(String text){
        String[] chars = new String[]{"=", "+", "-", "/", "*"};
        for(String i : chars){
            if(text.contains(i) || text.matches("\\d{2}")) return true;
        }
        return false;
    }
}
