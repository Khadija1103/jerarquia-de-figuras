public class Rectangle implements Shape {

    // Ancho y alto del rectángulo
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Calcula el área del rectángulo
    @Override
    public double getArea() {
        if (width <= 0 || height <= 0) {
            return 0;
        }

        return width * height;
    }
}