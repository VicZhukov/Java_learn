package Module_7;

public class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}
class WaterCounter{
    public double count(String text){
        char[] chars = text.toCharArray();
        double counter = 0;
        for(char i : chars){
            if(i == ' '){
                counter++;
            }
        }
        return counter / chars.length;
    }
}
