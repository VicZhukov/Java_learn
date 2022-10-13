//Module 4; Exercise 14;

package Main.java;

public class TriangleDrawer {
    public String drawTriangle(int side){
        int i = side;
        String paint = "";
        while (i > 0) {
            System.out.print("*".repeat(i));
            System.out.println();
            i--;
        }
        return paint;
    }

    public static void main(String[] args) {
        TriangleDrawer paint = new TriangleDrawer();

        System.out.println(paint.drawTriangle(5));
    }
}
