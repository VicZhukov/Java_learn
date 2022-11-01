package module_7;

public class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}
class EmailDetector{
    public boolean isPresent(String text){
        String[] strings = text.split(" ");
        for(String i : strings){
            if(i.length() > 4 && i.contains("@")){
                return true;
            }
        }
        return false;
    }
}