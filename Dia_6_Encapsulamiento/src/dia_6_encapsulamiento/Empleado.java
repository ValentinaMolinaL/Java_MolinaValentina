
package dia_6_encapsulamiento;

public class Empleado {
    
    private String nombre;
    private int id;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario){
        if(salario>0){
            this.salario = salario;
        }else{
            System.out.println("La cantidad debe ser positiva.");
        }
    }
    public void mostrarInformacion(){
        System.out.println("Empleado{" + "nombre=" + nombre + ", id=" + id + ", salario=" + salario + '}');
    }
}
