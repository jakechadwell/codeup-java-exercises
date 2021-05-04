package shapes;

public class Square extends Rectangle {
    public Square(double side){
        super(side, side);
    }
    public static double getArea(double side){
        return Math.pow(side, 2);
    }
    public static double getPerimeter(double side){
        return side * 4;
    }
}
