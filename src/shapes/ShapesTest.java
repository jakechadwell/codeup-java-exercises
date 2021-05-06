package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Rectangle(2.0, 10.0);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        myShape = new Square(5.0, 5.0);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());
    }
}
