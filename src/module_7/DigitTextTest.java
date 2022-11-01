package module_7;

public class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}
class DigitText{
    public boolean detect(String text){
        String[] buff = text.split(" ");
        for (String i : buff){
            if(i.matches("\\D*")) return false;
        }
        return true;
    }
}
