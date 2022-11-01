package module_7;

public class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}
class DoubleSpaceCleaner{
    public String clean(String phrase){
        String result = phrase.trim();
        result = result.replaceAll("[\\s]{2,}", " ");
        return result;
    }
}
