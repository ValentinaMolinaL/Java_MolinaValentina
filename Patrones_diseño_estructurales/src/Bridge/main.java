package Bridge;

// Bringe 
// separa una abstraccion de su implementacion para que ambas 
// puedan evolucionar independientemente.

//Ejemplo 
//Diferenten formas geometricasque pueden ser dibujadas de distintas maneras (rojo o azul).

public class main {
    // interfaz para la implementacion 
    interface Color {
        void applyColor();
    }
    
    //implementacicones concretas
    static class RedColor implements Color{
        public void applyColor(){
            System.out.println("Aplicando color rojo");
        }
    }
    
    static class BlueColor implements Color {
        public void applyColor(){
            System.out.println("Aplicando color azul");
        }
    }
    
    //clase base que usa una implementacion
    static abstract class Shape {
        protected Color color;
        
        public Shape(Color color){
            this.color = color;
        }
        
        abstract void draw();
    }
    
    //Subclase con una implementacion diferente
    static class Circle extends Shape{
        public Circle(Color color){ 
            super(color);
        }
        
        
        
        public void draw(){
            System.out.println("Dibujando circulo");
            color.applyColor();
        }
    }
    
    //uso del patron bridge
    public class BridgePatternDemo {
        public static void main(String[] args) {
            Shape redCircle =new Circle(new RedColor());
            Shape blueCircle =new Circle(new BlueColor());
            
            redCircle.draw();
            blueCircle.draw();
        }
    }
}
