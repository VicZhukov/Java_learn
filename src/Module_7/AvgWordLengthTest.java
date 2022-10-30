package Module_7;

public class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}
class AvgWordLength{
    public double count(String phrase){
        String[] result = phrase.split(" ");
        double length = 0;
        for(String i : result){
            length += i.length();
        }
        return length / result.length;
    }
}
