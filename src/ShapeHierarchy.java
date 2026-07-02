import java.util.ArrayList;
import java.util.List;

public class ShapeHierarchy {

    public static void main(String[] args) {

        // Crear una lista de figuras
        List<Shape> shapes = new ArrayList<>();

        // Agregar diferentes figuras
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(10, 10));
        shapes.add(new Triangle(6, 6));

        // Casos de prueba
        shapes.add(new Circle(0));
        shapes.add(new Rectangle(-4, 5));
        shapes.add(new Triangle(8, -2));

        // Recorrer la lista e imprimir el área de cada figura
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
