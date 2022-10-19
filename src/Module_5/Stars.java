package Module_5;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(102);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }

    @Override
    public String toString(){
        String thousand = "";
        String hundred = "";
        String dozen = "";
        String unit = "";
        int a = count / 1000;
        int b = count / 100 % 10;
        int c = count / 10 % 10;
        int d = count % 10;

        for (int i = 1; i <= a; i++){
            String x = "X";
            thousand = thousand + x;
        }
        for (int i = 1; i <= b; i++){
            String y = "Y";
            hundred = hundred + y;
        }
        for (int i = 1; i <= c; i++){
            String z = "Z";
            dozen = dozen + z;
        }
        for (int i = 1; i <= d; i++){
            String u = "*";
            unit = unit + u;
        }

        return thousand + hundred + dozen + unit;
    }
}
