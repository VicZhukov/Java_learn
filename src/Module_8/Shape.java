package Module_8;

class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String name) {
        this.name = name;
    }
}
class Circle extends Shape{
    public Circle(String name) {
        super(name);
    }
}
class Quad extends Shape{
    public Quad(String name) {
        super(name);
    }
}
class Triangle extends Shape{
    public Triangle(String name) {
        super(name);
    }
}
class Squad extends Shape{
    public Squad(String name) {
        super(name);
    }
}
class Oval extends Shape{
    public Oval(String name) {
        super(name);
    }
}
class ShapeTest{
    public static void main(String[] args) {
        Shape circle = new Circle("circle");
        circle.setName("Circle");
        System.out.println(circle.getName());
        Shape quad = new Quad("Quad");
        System.out.println(quad.getName());
        Shape triangle = new Triangle("Triangle");
        System.out.println(triangle.getName());
        Shape squad = new Squad("Squad");
        System.out.println(squad.getName());
        Shape oval = new Oval("Oval");
        System.out.println(oval.getName());
    }
}

