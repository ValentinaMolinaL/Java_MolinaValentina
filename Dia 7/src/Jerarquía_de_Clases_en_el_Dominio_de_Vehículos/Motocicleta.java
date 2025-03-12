
package Jerarquía_de_Clases_en_el_Dominio_de_Vehículos;

public class Motocicleta extends Vehiculo{
    
    private String tipoManubrio;

    public Motocicleta() {
    }

    public Motocicleta(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }

    public Motocicleta(String tipoManubrio, String marca, String modelo) {
        super(marca, modelo);
        this.tipoManubrio = tipoManubrio;
    }
    
    @Override
    public void mostrarDetalles(){
    System.out.println("Tipo de manubrio :"+tipoManubrio);
    }    
}
