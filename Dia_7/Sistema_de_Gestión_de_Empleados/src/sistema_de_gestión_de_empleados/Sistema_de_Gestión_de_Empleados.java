
package sistema_de_gestión_de_empleados;

import java.util.ArrayList;
import java.util.List;

public class Sistema_de_Gestión_de_Empleados {

    public static void main(String[] args) {
        
        List<Empleado> emp1 = new ArrayList<>();
        emp1.add(new EmpleadoFijo("Juan", 2000));
        emp1.add(new EmpleadoXHoras("María", 15, 50)); 
        emp1.add(new EmpleadoFijo("Pedro", 3000));
        emp1.add(new EmpleadoXHoras("Ana", 20, 30)); 

        for (Empleado empleado : emp1) {
            System.out.println("Nombre:" + empleado.getNombre()+"   Bonificación:" + empleado.calcularBonificacion());
            System.out.println("---------------------------------");
        }
    }
    
}
