package module_5;

class XFuelEngine extends Engine {
    protected String serialNumber;
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    @Override
    public String getFuelType(){
        return "XFuel";
    }
}
