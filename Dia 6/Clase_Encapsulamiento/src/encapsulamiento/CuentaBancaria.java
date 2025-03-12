/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author Uniminuto Tibu
 */
public class CuentaBancaria {
    
    // Atributos
    private String numeroCuenta;
    private double saldo;
    
    // Constructores vacios y compuestos

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public CuentaBancaria() {
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    // Setter personalizado para saldo
    public void depositar(double cantidad){
        if(cantidad > 0){
        saldo = saldo + cantidad;
            System.out.println("El deposito fue realizado!!! :yay:");
        }else {
            System.out.println("La cantidad a depositar debe ser positova :sadfeis:");
        }
    }
    
    // Metodo para retirar platica con validaciones
    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            System.out.println("Su retiro fue realizado!!! :happy");
        }else if(cantidad > saldo){
            System.out.println("No tienes los fondos suficientes :sadfaces:");
        }else{
            System.out.println("Debes ingresar una cantidad positiva.");
        }
    }
    
    
}
