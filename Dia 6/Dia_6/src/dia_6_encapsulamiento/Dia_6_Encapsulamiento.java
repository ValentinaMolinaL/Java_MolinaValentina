
package dia_6_encapsulamiento;

public class Dia_6_Encapsulamiento {

    public static void main(String[] args) {
        
        System.out.println("=========================");
        System.out.println("====== Ejercicio #1======");
        Empleado verf1=new Empleado("valentina",01, 10000000);
        verf1.setSalario(0);
        verf1.mostrarInformacion();
        
        
        
        System.out.println("=========================");
        System.out.println("====== Ejercicio #2======");      
        Producto prod1=new Producto ("12345", "Trompeta", 20, 1000000);
        Producto prod2=new Producto ("54321", "saxo", 30, 2000000);
        Producto prod3=new Producto ("67890", "clarinete", 10, 3000000);
        Producto prod4=new Producto ("09876", "piano", 40, 4000000);
        
        prod1.setCantidad(0);        
        prod1.setPrecio(0);
        System.out.println("=================================================================================================");
        System.out.println("Codigo:"+prod1.getCodigo()+"  Nombre:"+ prod1.getNombre()+ "  Cantidad:"+prod1.getCantidad()+"  Precio:"+prod1.getPrecio());
        System.out.println("Codigo:"+prod2.getCodigo()+"  Nombre:"+ prod2.getNombre()+ "  Cantidad:"+prod2.getCantidad()+"  Precio:"+prod2.getPrecio());
        System.out.println("Codigo:"+prod3.getCodigo()+"  Nombre:"+ prod3.getNombre()+ "  Cantidad:"+prod3.getCantidad()+"  Precio:"+prod3.getPrecio());
        System.out.println("Codigo:"+prod4.getCodigo()+"  Nombre:"+ prod4.getNombre()+ "  Cantidad:"+prod4.getCantidad()+"  Precio:"+prod4.getPrecio());
        System.out.println("=================================================================================================");

        prod1.actualizarStock(10);
        prod2.actualizarStock(20);
        prod3.actualizarStock(30);
        prod4.actualizarStock(40);
        
        System.out.println("=========================");
        System.out.println("====== Ejercicio #3======");   
        
        CuentaAhorro cue1= new CuentaAhorro(20,20000);
            
        cue1.depositar(100);
        cue1.retirar(50);
        cue1.aplicarInteres();
            
            System.out.println("El estado final de la cuenta es: "+ cue1.getSaldo());
}
}
