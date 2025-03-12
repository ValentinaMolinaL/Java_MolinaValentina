/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author Uniminuto Tibu
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ENCAPSULAMIENTO
        
        // Se refiere a la restriccio a algunos de los componentes de un objeto,
        // especialmente los atributos, con el fin de prevenir modificaciones no autorizadas
        
        Persona p1 = new Persona ();
        p1.setNombre("Valentina");
        p1.setEdad(21);
        System.out.println(p1.getNombre());
        
        CuentaBancaria c1 = new CuentaBancaria("AERT0NB7UDE", 10000000);
        System.out.println(c1.getSaldo());
        
        c1.depositar(2500000);
        System.out.println((int)c1.getSaldo());
        
        c1.retirar(900000);
        System.out.println((int)c1.getSaldo());
        
    }
    
}
