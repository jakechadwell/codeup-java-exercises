package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5.0, 4.0);
        Rectangle box2 = new Square(5.0);
        System.out.println(Rectangle.getArea(box1));
        System.out.println(Rectangle.getPerimeter(box1));
        System.out.println(Square.getArea(box2));
        System.out.println(Square.getPerimeter(box2));
    }
}
