//Module 4; Exercise 10-13;

package module_4;

public class ArlanHelper {
    public String drawQuad(int n){
        int i = 0;
        String paint = "";
        while (i < n) {
            int k = 0;
            while (k < n) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
        return paint;
    }

    public String drawRect(int width, int height, char c){
        int i = 0;
        String paint = "";
        while (i < height) {
            int k = 0;
            while (k < width) {
                System.out.print(c);
                k++;
            }
            System.out.println();
            i++;
        }
        return paint;
    }

    public String drawLine(int length){
        String paint = "";
        int count = 1;
        while (count <= length){
            if(count%2!=0){
                System.out.print("*");
            }else System.out.print("#");
            count++;
        }
        return paint;
    }

    public String drawPattern(char[] pattern, int repeatCount){
        String result = new String(pattern);
        String res = "";
        int count = 1;
        while(count <= repeatCount){
            System.out.print(result);
            count++;
        }
        return res;
    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        //System.out.println(helper.drawQuad(3));
        //Should be:
        //XX
        //XX
        //XX
        //System.out.println(helper.drawRect(2, 3, 'X'));
        //Should be:
        //*#*#*
        //System.out.println(helper.drawLine(7));
        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
}
