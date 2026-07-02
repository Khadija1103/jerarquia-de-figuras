public class Triangle implements Shape {

    // Base y altura del triángulo
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Calcula el área del triángulo
    @Override
    public double getArea() {
        if (base <= 0 || height <= 0) {
            return 0;
        }

        return (base * height) / 2;
    }
}