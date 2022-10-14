package Module_5;



public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.equals("") || name.length() >= 100){
            return;
        }
        this.name = name;
    }

    public String getSerialNumber(){

        return serialNumber;
    }
    public void setSerialNumber(String serialNumber){
        String result = getSerialNumber();
        if(!result.equals(serialNumber)){
            return;
        }
        this.serialNumber = serialNumber;
    }

    public static void main(String[] args) {
            SpaceShip ship = new SpaceShip();
            //System.out.println(ship.getName()); //Should be null

            /*ship.setName("Walker");
            System.out.println(ship.getName()); //Should be Walker

            ship.setName("");
            System.out.println(ship.getName()); //Should be Walker, empty value ignored

            ship.setName("Voyager ".repeat(100));
            System.out.println(ship.getName()); //Should be Walker, too long value ignored */

            ship.setSerialNumber("SN506788");
            System.out.println(ship.getSerialNumber()); //Should be SN506788

            ship.setSerialNumber("EE123456");
            System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value
    }
}
