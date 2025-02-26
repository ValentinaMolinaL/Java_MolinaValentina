
package Jerarquía_de_Clases_en_el_Dominio_de_Vehículos;

public class Main_Ejercicio_1 {

    public static void main(String[] args) {
        
        
        System.out.println("=================================");
        Vehiculo veh1 = new Vehiculo("Tesla","Model S");
        veh1.mostrarDetalles();
        Coche coc1 = new Coche(4,"toyota","123456");
        coc1.mostrarDetalles();
        
        System.out.println("=================================");
        Vehiculo veh2 = new Vehiculo("GN", "2015");
        veh2.mostrarDetalles();
        Motocicleta mot1 = new Motocicleta("manubrio de caída","xtz", "2000");
        mot1.mostrarDetalles();
        
    }
    
}
