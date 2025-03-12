package SOLID.OCP;

abstract class Shape {

        abstract double calculateArea();
}
public class Good {

    

    static class Rectangle extends Shape {

        double width, height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double calculateArea() {
            return width * height;
        }
    }

    static class Circle extends Shape {

        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    static class AreaCalculator {

        public double calculateArea(Shape shape) {
            return shape.calculateArea();
        }
    }
    public static void main(String[] args) {
        Shape rectangulo=new Rectangle(10, 12);
        Shape circulo = new Circle(5);
        
        AreaCalculator areaC=new AreaCalculator();
        System.out.println("Área del rectángulo: " + areaC.calculateArea( rectangulo));
        System.out.println("Área del círculo: " + areaC.calculateArea(circulo));
        

    }

}
