package module_6;

class LevelLoader{
    private static LevelLoader instance = new LevelLoader();

    public static LevelLoader getInstance(){
        return instance;
    }
    private LevelLoader(){

    }
    String load(String levelName){
        return "Loading level " + levelName + " ...";
    }
}

public class LevelLoaderTest {
    public static void main(String[] args) {
        //LevelLoader levelLoader = new LevelLoader();
        //ex 21
        //Loading level Startlevel ...
        //System.out.println(levelLoader.load("StartLevel"));
        // ex 22
        //Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
        System.out.println(LevelLoader.getInstance() == LevelLoader.getInstance());
    }
}

