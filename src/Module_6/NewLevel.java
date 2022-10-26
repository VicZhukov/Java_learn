package Module_6;

// ex 29
public class NewLevel {
    private int width;
    private int height;

    public NewLevel(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
class NewLevelLoader {
    public void newLoad(NewLevel newLevel) throws LevelTooBigException {
        int sqr = newLevel.getHeight() * newLevel.getWidth();
        if(sqr > 100000){
            throw new LevelTooBigException();
        }
        System.out.println("Level loaded");
    }
}
class LevelTooBigException extends Exception{
    LevelTooBigException(){
        super("Level too big");
    }
}

class NewLevelLoaderTest {
    public static void main(String[] args) {
        //Level loaded
        try {
            new NewLevelLoader().newLoad(new NewLevel(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new NewLevelLoader().newLoad(new NewLevel(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}
