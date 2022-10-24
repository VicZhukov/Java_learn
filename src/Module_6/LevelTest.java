package Module_6;

import java.util.Arrays;

public class LevelTest {
    public static void main(String[] args) {
        // ex 16
        //Quarke level, name is Test
        //System.out.println(new Level("Test"));

        // ex 17
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        //Quarke level, name is Test, point count is 3
        //System.out.println(new Level("Test", points));

        // ex 18
        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
        System.out.println(new Level(info, points));
    }
}
class Level{
    private LevelInfo levelInfo;
    private Point[] points;

    /*public Level(String name){
        this.name = name;
    }*/

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    @Override
    public String toString() {
        //return "Quarke level, name is " + name;
        int count = 0;
        String[] res = Arrays.toString(points).split("\\s+");
        for (int i = 1; i <= res.length; i++) {
            count++;
        }
        return "Quarke level, name is " + levelInfo.name + ", difficulty is " + levelInfo.difficulty + ", point count is " + count;

    }
    static class Point{
        private int x;
        private int y;

        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static class LevelInfo{
        private String name;
        private String difficulty;

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }
    }
}
