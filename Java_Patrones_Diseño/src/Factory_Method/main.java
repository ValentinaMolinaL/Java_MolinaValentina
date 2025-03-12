package Factory_Method;

//Factory Methad 
//Este patrón define una interfaz para crear objetos, pero permite a las subclases decidir qué 
// clase concreta instanciar. Se usa para evitar la creación directa de objetos con new. 
// Interface Producto
interface Producto {
    void usar();
}

//Implementaciones concretas 
class ProductoA implements Producto{
        
    public void usar(){
        System.out.println("Usando producto A");
    }

}

class ProductoB implements Producto{
    public void usar(){
        System.out.println("Usando producto B");
    }
}

    public class main {
    // Fábrica con el método Factory 

    class Factory {
        public static Producto crearProducto(String tipo) {
            if (tipo.equalsIgnoreCase( "A")) { 
            return new ProductoA();
        }else if (tipo.equalsIgnoreCase ("B")) { 
            return new ProductoB();
        }
        throw new IllegalArgumentException("Tipo desconocido");
        }
    }
    // Uso 
    public static void main(String[] args) { 
        Producto pl = Factory.crearProducto ("А"); 
        pl.usar(); 
        
        Producto p2 = Factory.crearProducto("B"); 
        p2.usar(); 
    }
}