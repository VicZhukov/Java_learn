package module_7;

public class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}
class NameCounter{
    public int count(String text){
        String[] strings = text.split(" ");
        int counter = 0;
        for(String i : strings){
            if(i.charAt(0) == Character.toUpperCase(i.charAt(0)) && !i.equals(i.toUpperCase())){
                counter++;
            }
        }
        return counter;
    }
}