package module_5;

abstract class SpaceObject {

    public static void main(String[] args) {
        PlanetTester tester = new PlanetTester();
        System.out.println(tester.test(new Mars())); //Should be true
        System.out.println(tester.test(new Moon())); //Should be false
    }
}
abstract class Planet extends SpaceObject{

}
class Mars extends Planet{

}
class Moon extends SpaceObject{

}
class PlanetTester{
    String test(SpaceObject object){
        if(object instanceof Planet){
            return "planet";
        }
        return "not planet";
    }
}

