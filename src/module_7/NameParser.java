package module_7;

public class NameParser {
    public String parse(String[] names) {
        StringBuilder result = new StringBuilder();
        for(String i : names){
            String firstName = i.split(" ")[0];
            result.append(firstName).append(", ");
        }
        if(names.length == 0){
            return "";
        }
        return result.toString().trim().substring(0, result.length()-2);
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}

