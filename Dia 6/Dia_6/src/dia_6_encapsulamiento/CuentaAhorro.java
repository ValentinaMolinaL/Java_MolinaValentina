
package dia_6_encapsulamiento;

public class CuentaAhorro extends CuentaBancaria{
    private double tasaInteres;


    public CuentaAhorro(double tasaInteres, double saldo) {
        super(saldo);
        this.tasaInteres = tasaInteres;
    }
    
    public void aplicarInteres(){
        double saldoAct=getSaldo()+(getSaldo()*tasaInteres / 100);
        setSaldo(saldoAct);
        System.out.println("interes aplicado, tu saldo actualizado es de  "+ getSaldo());
    }
}