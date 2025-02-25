
package dia_6_encapsulamiento;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria() {
    }
    
    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double cantidad){
        if(cantidad>0){
            saldo+=cantidad;
            System.out.println("se realizo un deposito a tu cuenta");
        }else{
            System.out.println("La cantidad debe ser mayor que 0");
        }
    }
    public void retirar(double cantidad){
        if(cantidad>0 && cantidad<= saldo){
            saldo-=cantidad;
            System.out.println("se realizo un retiro a tu cuenta");
        }else{
            System.out.println("el saldo insuficiente");
        }
    }
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}