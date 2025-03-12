package Singleton;

//singleton
//garantiza que solo haya una instancia de una clase en todo el programa
public class main {
    static class Singleton{
        private static Singleton instancia;

        private Singleton() {
        }

        

        public static Singleton getInstance() {
            if (instancia == null){
                instancia = new Singleton();
            }
            return instancia;
        }
        public void mostrarMensaje(){
            System.out.println("instancia única de singleton");
        }
    }
    
    //uso 
        public static void main(String[] args) {
            Singleton singleton1 = Singleton.getInstance();
            Singleton singleton2 = Singleton.getInstance();
            
            singleton1.mostrarMensaje();
            
            System.out.println(singleton1 == singleton2);//true, misma instancia
    }
}
