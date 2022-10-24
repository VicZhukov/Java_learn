package Module_6;

import java.util.Arrays;

public class LevelTest {
    public static void main(String[] args) {
        //Quarke level, name is Test
        //System.out.println(new Level("Test")); // ex 16

        // ex 17
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        //Quarke level, name is Test, point count is 3
        System.out.println(new Level("Test", points));
    }
}
class Level{
    private String name;
    private Point[] points;

    public Level(String name){
        this.name = name;
    }

    public Level(String name, Point[] points) {
        this.name = name;
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
        return "Quarke level, name is " + name + ", point count is " + count;

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
}
