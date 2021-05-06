package shapes;

public class Square extends Quadrilateral {

    public Square(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return 2*(this.length+this.width);
    }

    public double getArea() {
        return this.width*this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
