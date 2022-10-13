package Main.Module_4;

public class CheapStocks {
    public String getCheapStocks(String[] stocks){
        String part0 = "";

        for (String price : stocks) {
            String[] parts = price.split(" ");
            int part1 = Integer.parseInt(parts[1]);
                if(part1 < 200){
                    part0 = part0 + (parts[0] + " ");
                }
        }
        return part0;
    }

    public static void main(String[] args) {
        CheapStocks shop = new CheapStocks();

        System.out.println(shop.getCheapStocks(new String[] {"gun 500", "firebow 70", "pixboom 200", "ugug 150"}));
    }
}
