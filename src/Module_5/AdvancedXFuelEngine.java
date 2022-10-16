package Module_5;

public class AdvancedXFuelEngine extends XFuelEngine{
    public void printInfo(){
        System.out.println("Serial number is " + serialNumber + ", " +  "power is "  + getPower());
    }

    public static void main(String[] args) {
        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo(); //Serial number is SN504030, power is 1000
    }
}
