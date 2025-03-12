
package Jerarquía_de_Clases_en_el_Dominio_de_Vehículos;

public class Vehiculo {
    
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarDetalles(){
    System.out.println("Vehiculo => " + "marca:" + marca + "   modelo:" + modelo);
    }
}
