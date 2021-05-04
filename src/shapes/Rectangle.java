package shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public static double getArea(Rectangle box){
        return box.length*box.width;
    }

    public static double getPerimeter(Rectangle box){
        return (2*box.length) + (2*box.width);
    }
}
