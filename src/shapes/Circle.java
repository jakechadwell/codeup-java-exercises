package shapes;

public class Circle {
    private double radius;
    private static int circlesCreated = 0;

    public Circle(double radius){
        this.radius = radius;
        Circle.circlesCreated++;
    }
    public double getArea(){
        return (Math.PI*Math.pow(this.radius, 2));
    }
    public double getCircumference(){
        return (2*Math.PI*this.radius);
    }
    public static void getCirclesCreated(){
        System.out.printf("You have created %d circle/s.", circlesCreated);
    }
}
