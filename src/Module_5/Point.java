package Module_5;

public class Point {
    private int x;
    private int y;
    private int z;

    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }

    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }

    public void setZ(int z){
        this.z = z;
    }
    public int getZ(){
        return z;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Point point = (Point) obj;
        return x == point.x && y == point.y && z == point.z;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        result = prime * result + z;

        return result;
    }
}

class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        System.out.println(p1.equals(p2)); //Should be true
        System.out.println(p1.equals(p3)); //Should be false
    }
}
