
package dia_6_encapsulamiento;

public class Producto {
    
    private String codigo;
    private String nombre;
    private int cantidad; 
    private double precio;

    public Producto() {
    }

    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
                if(cantidad>0){
        this.cantidad = cantidad;
        }else{
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio >0){
            this.precio = precio;
        }else{
            System.out.println("el precio debe ser mayor a 0");
        }
    }
    public void actualizarStock(int cantidad){
        if(this.cantidad+cantidad>0){
            this.cantidad+=cantidad;
            System.out.println("Altualizacion echa al producto "+nombre+" ahora tienes "+this.cantidad+" en el stock");
        }else{
            System.out.println("stocks insuficientes");
        }
    }
    
}
