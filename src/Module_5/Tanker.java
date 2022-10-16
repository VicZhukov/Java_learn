package Module_5;

class Tanker {
    private String serialNumber;

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public String getSerialNumber(){
        return serialNumber;
    }

    protected String getFuelType(){
        return "A500";
    }
    public void refuel(int amount){
        System.out.println("Add " + amount + " of " + getFuelType() + ", " + "tanker serial number is " + getSerialNumber());
    }
    public static void main(String[] args) {
        Tanker tanker = new MX200Tanker();
        tanker.setSerialNumber("SN504030");
        tanker.refuel(300);
    }
}
