
package Flyweight;

import java.util.HashMap;
import java.util.Map;

//Flyweight
//Reduce el uso de memoria compartiendo objetos similares en lugar de crearlos repetidamente.
public class main {

   static class Circle {
        private String color;

        public Circle(String color) {
            this.color = color;
        }

        public void draw() {
            System.out.println("Dibujando círculo de color " + color);
        }
    }

    class CircleFactory {
        private static final Map<String, Circle> circleMap = new HashMap<>();

        public static Circle getCircle(String color) {
            circleMap.putIfAbsent(color, new Circle(color));
            return circleMap.get(color);
        }
    }

    // Uso del patrón Flyweight
        public static void main(String[] args) {
            Circle c1 = CircleFactory.getCircle("Rojo");
            Circle c2 = CircleFactory.getCircle("Rojo");
            c1.draw();
            c2.draw();
            System.out.println("Objetos iguales: " + (c1 == c2));
        }
}
