/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author Uniminuto Tibu
 */
public class Persona {
    
    // Atributos
    private String nombre;
    private int edad;
    
    // Constructores 
    
    public Persona(){}

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters
    // Son metodos que permiten obtener o midificar atributos prrivados 
    // de una clase.

    public String getNombre() {
        return "Tu nombre es: " + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0){
            this.edad = edad;
        } else{
            System.out.println("La edad no valida, debe ser mayor a 0");
        }
        
    }
    
    
    
}
