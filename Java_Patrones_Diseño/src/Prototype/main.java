package Prototype;

//Prototype
//Se usa para clonar objetos sin acoplar el codigo a sus clases completas
//Java proporciona cloneable para esto.
public class main {
    static class Persona implements Cloneable{
        private String nombre;
        private int edad;
        
        public Persona(String nombre, int edad){
            this.nombre=nombre;
            this.edad=edad;
        }
        public void mostrarInfo(){
            System.out.println("persona: "+nombre+" edad: "+edad);
        }
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
    
    // uso 
    public static void main(String[] args) {
        try {
            Persona  p1 = new Persona("juan", 10);
            Persona  p2 = new (Persona) p1.clone();//clonando el objeto
            
            p1.mostrarInfo();
            p2.mostrarInfo();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    
}
