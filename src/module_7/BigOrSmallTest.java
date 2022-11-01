package module_7;

public class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}
class BigOrSmall{
    public String calculate(String text){
        char[] chars = text.toCharArray();
        int upperCounter = 0;
        int lowerCounter = 0;
        for(char i : chars) {
            if(i == Character.toUpperCase(i)){
                upperCounter++;
            }
            else if(i == Character.toLowerCase(i)){
                lowerCounter++;
            }
        }
        String result = "";
        if(upperCounter > lowerCounter){
            result = "Big";
        }else result = "Small";
        if(upperCounter == lowerCounter){
            result = "Same";
        }
        return result;
    }
}
