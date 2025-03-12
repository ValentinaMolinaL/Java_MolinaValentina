

package SOLID.OCP;

public class Bad {
    // Open/Closed Principle (OCP) - Principio Abierto/Cerrado
    // Las clases deben estar abiertas para la extensión, pero cerradas para la modificación.

    class Rectangle {
        public double width;
        public double height;
    }

    class AreaCalculator {
        public double calculateRectangleArea(Rectangle rectangle) {
            return rectangle.width * rectangle.height;
        }
        //
    }

}
