package Module_8;

public interface Shape {
    void name();
}
class Circle implements Shape{
    @Override
    public void name(){
        System.out.println("Circle");
    }
}
class Quad implements Shape{
    @Override
    public void name() {
        System.out.println("Quad");
    }
}
class Triangle implements Shape{
    @Override
    public void name() {
        System.out.println("Triangle");
    }
}
class Squad implements Shape{
    @Override
    public void name() {
        System.out.println("Squad");
    }
}
class Oval implements Shape{
    @Override
    public void name() {
        System.out.println("Oval");
    }
}
class ShapeTest{
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape squad = new Squad();
        Shape triangle = new Triangle();
        Shape oval = new Oval();

        circle.name();
        quad.name();
        squad.name();
        triangle.name();
        oval.name();
    }
}

