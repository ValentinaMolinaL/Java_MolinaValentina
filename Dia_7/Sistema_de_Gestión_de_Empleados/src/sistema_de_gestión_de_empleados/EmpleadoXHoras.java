
package sistema_de_gestión_de_empleados;

public class EmpleadoXHoras extends Empleado {
    private int horasTrabajadas;

    public EmpleadoXHoras(String nombre, double salario, int horasTrabajadas) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    @Override
    public double calcularBonificacion() {
        double bonificacionBase = super.calcularBonificacion(); // Bonificación base
        if (horasTrabajadas > 40) {
            bonificacionBase += 100;
        }
        return bonificacionBase;
    }
}