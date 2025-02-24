/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_6_encapsulamiento;

/**
 *
 * @author Uniminuto Tibu
 */
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

    public void setSalario(double verificacion) {
        if (verificacion > 0){
            salario = salario + verificacion;
            System.out.println("la cantidad esta bien");
        }else{
            System.out.println("la cantidad debe ser positiva");
        }
    }

    
    
    
    

    
}
