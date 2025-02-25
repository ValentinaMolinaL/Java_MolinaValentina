
package clase_7_herencia;

public class Animal {
    protected String nombreCientifico;
    protected String especie;
    protected String habitat;
    protected boolean tienePelo;
    protected int cantPatas;
    
    
    //Constructores vacios y compuestos 

    public Animal() {
    }

    public Animal(String nombreCientifico, String especie, String habitat, boolean tienePelo, int cantPatas) {
        this.nombreCientifico = nombreCientifico;
        this.especie = especie;
        this.habitat = habitat;
        this.tienePelo = tienePelo;
        this.cantPatas = cantPatas;
    }
    
    //metodo para todos los animales
    public void hacerSonido(){
        System.out.println("el animalito hace un sonido");
    }
    public void dormir(){
        System.out.println("Estoy durmiendo");
    }
    

    
}
