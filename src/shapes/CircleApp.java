package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        boolean nextCircle;
        do {
            Input userInput = new Input();
            double currentRadius = userInput.getDouble("Enter circle radius: ");
            Circle thisCircle = new Circle(currentRadius);
            System.out.println("New Circles' Measurements Are: ");
            System.out.printf("Circumference: %.2f\n", thisCircle.getCircumference());
            System.out.printf("Radius: %.2f\n", currentRadius);
            System.out.printf("Area: %.2f\n", thisCircle.getArea());

            nextCircle = userInput.yesNo("Another Circle?");
        } while (nextCircle);
        Circle.getCirclesCreated();
    }

}
