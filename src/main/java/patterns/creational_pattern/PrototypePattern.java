package patterns.creational_pattern;

interface Shape{
    public void draw();
    Shape clone();
}

class Circle implements Shape {
    private String color;
    public Circle(String color){
        this.color = color;
    }

    @Override
    public void draw(){
        System.out.println("Drawing red circle.");
    }

    @Override
    public Shape clone(){
        return new Circle(this.color);
    }
}

class ShapeClient{
    private final Shape shapePrototype;
    public ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    public Shape createShape(){
        return shapePrototype.clone();
    }
}

public class PrototypePattern {
    public static void main(String[] args) {
        Shape circle = new Circle("red");
        ShapeClient shapeClient = new ShapeClient(circle);
        Shape redCircle = shapeClient.createShape();
        redCircle.draw();
    }
}
