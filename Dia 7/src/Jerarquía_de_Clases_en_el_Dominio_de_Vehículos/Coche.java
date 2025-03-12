
package Jerarquía_de_Clases_en_el_Dominio_de_Vehículos;

public class Coche extends Vehiculo{
    
    private int numeroPuertas;

    public Coche() {
    }

    public Coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Coche(int numeroPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public void mostrarDetalles(){
    System.out.println("Numero de Puertas "+numeroPuertas);
    }

}
