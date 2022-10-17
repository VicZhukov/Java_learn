package Module_5;

public class SpaceportMessages {
    public static String generateLandingMessage(String shipName, String spaceport, String time){
        return "Spaceship " + shipName + " landing at " + spaceport + ", time is " + time;
    }

    public static void main(String[] args) {
        //SpaceportMessages.generateLandingMessage();
        System.out.println(SpaceportMessages.generateLandingMessage("SunFlower", "EarthKeeper", "20:40"));
    }
}
