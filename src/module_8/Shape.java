package module_8;

public abstract class Shape {
    void name(){}
}
class Circle extends Shape{
    @Override
    public void name(){
        System.out.println("Circle");
    }
}
class Quad extends Shape{
    @Override
    public void name() {
        System.out.println("Quad");
    }
}
class Triangle extends Shape{
    @Override
    public void name() {
        System.out.println("Triangle");
    }
}
class Squad extends Shape{
    @Override
    public void name() {
        System.out.println("Squad");
    }
}
class Oval extends Shape{
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

