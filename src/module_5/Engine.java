package module_5;

public class Engine {
    private int power;

    public void setPower(int power){
        this.power = power;
    }
    public int getPower(){
        return power;
    }

    public String getFuelType(){
        return "A500";
    }

    public static void main(String[] args) {
        //System.out.println(new Engine().getFuelType());

        Engine basicEngine = new Engine();
        System.out.println(basicEngine.getFuelType()); //A500

        Engine xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType()); //XFuel
    }
}
