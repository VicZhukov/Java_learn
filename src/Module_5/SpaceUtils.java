package Module_5;

class SpaceUtils {
    public static final int PLANET_COUNT = 8;
    public static final String HOME_PLANET_NAME = "Earth";
    public static final String HOME_STAR_NAME = "Sun";

    public static String pluralPlanets(int planetCount){
        String result;
        int x = planetCount;
        if(planetCount == 1){
            result = planetCount + " planet";
        }else return x + " planet";

        return result;
    }
    public static String generateStartMessage(String shipName, String time){
        return "Ship " + shipName + " start at " + time;
    }

    public static void main(String[] args) {
        System.out.println(SpaceUtils.PLANET_COUNT);
        System.out.println(SpaceUtils.pluralPlanets(1));
        System.out.println(SpaceUtils.pluralPlanets(5));
        System.out.println(SpaceUtils.generateStartMessage("Earthkeeper", "20:40"));
    }
}
