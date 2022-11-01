package module_6;

public class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}
class RectangleArea{
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public RectangleArea(int[] coords){
        this.x1 = coords[0];
        this.y1 = coords[1];
        this.x2 = coords[2];
        this.y2 = coords[3];
    }
    public int getArea(){
        return ((x2 - x1) * (y2 - y1));
    }
}
