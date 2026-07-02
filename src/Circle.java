public class Circle implements Shape {

    // Radio del círculo
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Calcula el área del círculo
    @Override
    public double getArea() {
        if (radius <= 0) {
            return 0;
        }

        return Math.PI * radius * radius;
    }
}