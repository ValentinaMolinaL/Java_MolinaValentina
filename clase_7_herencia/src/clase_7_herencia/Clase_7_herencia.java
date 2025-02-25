
package clase_7_herencia;

public class Clase_7_herencia {

    public static void main(String[] args) {
        //Herencia 
        //Es un mecanismo que permite crear nuevas clases 
        //a partir de clases exitentes. La clase que se 
        //hereda se denomina superclase o clase base, donde 
        //la nueva clase se conoce como subclase o clase derivada. 
        //Características: 
        //1.Reutilización de código: Las subclases heredan atributos y 
        //métodos de la superclase, evitando así la duplicación de código. 
        //
        //2. Jerarquía de clases: Permite organizar y estructurar el código en 
        //una Jerarquía lógica. 
        //
        //3. Extensibilidad: Se pueden agregar o modificar funcionalidades en la 
        //subclase sin afectar la superclase.
        System.out.println("Holiiiiiiiiiiiiii!!!!!!!");
        
        Perro perro1=new Perro("lucas");
        perro1.hacerSonido();
        perro1.moverCola();
        
        
        //Polimorfismo 
        //El polimorfismo permite que un objeto se comporte de 
        //diferentes maneras según el contexto. En Java, esto se traduce 
        //en que una variable de un tipo de referencia (por ejemplo, la superclase) 
        //pueda referenciar a objetos de cualquier subclase.
        
        //Creamos una variable llamada "miAnimal" de tipo "Animal", pero se le asigna /
        //un objeto de la subclase "Perro"
        Animal miAnimal =new Perro("firulais");
        //Aunque la variable es de tipo "Animal", se invoca el metodo sobrescrito en perro
        
        //Aunque la variable es de tipo "Animal", se invoca el método sobreescrito en Perro". 
        //Al momento de llamar "miAnimal.hacerSonido()", el método que se ejecuta es el de la clase 
        //"Perro", no el de "Animal". Esto se debe a que a pesar que la variables es de tipo "Animal", 
        //el método sobrescrito en Perro se invoca en tiempo de ejecución. Esto se conoce como 
        //"despacho dinámico" o "vinculación tardia".
        miAnimal.hacerSonido();
        miAnimal.dormir();
        //Para acceder a metodos especificos de perro, es necesario realizar un casting
        
        if(miAnimal instanceof Perro){
            Perro miPerro=(Perro)miAnimal;
            ((Perro) miAnimal).moverCola();
        }
    }
}
