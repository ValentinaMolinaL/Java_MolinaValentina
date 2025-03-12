
package sistema_de_gestión_de_empleados;

public class EmpleadoFijo extends Empleado {
    public EmpleadoFijo(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBonificacion() {
        return getSalario() * 0.20; 
    }
}