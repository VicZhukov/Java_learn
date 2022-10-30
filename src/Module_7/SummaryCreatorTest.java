package Module_7;

public class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));

        //sapimofokobavul
        String longPhrase2 = "sapimofokobavul goegiwnut";
        System.out.println(summaryCreator.create(longPhrase2));
    }
}
class SummaryCreator{
    public String create(String text){
        if(text.length() >= 16 && text.charAt(15) != ' '){
            text = text.substring(0, 15) + "...";
        }
        if(text.length() >= 16 && text.charAt(15) == ' '){
            text = text.substring(0, 15);
        }

        return text;
    }
}
