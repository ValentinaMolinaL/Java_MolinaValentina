
package clase_7_herencia;

public class Perro extends Animal{
    private String raza;
    private int edad;
    private String sexo;

    public Perro(String nombreCientifico) {
        this.nombreCientifico=nombreCientifico;
    }

    public Perro(String raza, int edad, String sexo) {
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Perro(String raza, int edad, String sexo, String nombreCientifico, String especie, String habitat, boolean tienePelo, int cantPatas) {
        super(nombreCientifico, especie, habitat, tienePelo, cantPatas);
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }

    @Override // Anotaciones 
    public void hacerSonido () {
        System.out.println("El perro "+nombreCientifico+" dice !guauuuuuuuu!");
    }
    public void moverCola () {
        System.out.println("El perro "+nombreCientifico+" mueve su cola");
    }

    
    
}
