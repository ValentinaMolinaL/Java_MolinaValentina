
package Adapter;

//Adapter 
//Convierte la interfaz de una clase en otra interfaz esperada por el cliente. 
// Permite que clases incompatibles trabajen juntas. 

//Contexto 
//Supongamos que tenemos un sistema antiguo que usa Volt120 y 
// queremos adaptarlo a un sistema moderno que usa Volt12.
public class main {
    // Interfaz esperada por el cliente
    interface Volt12{
        int getVolt12();
    }
    
    //Clase existente con una interfaz diferente
    static class Volt120{
        int getVolt120(){
            return 120;
        }
    }
    
    // Adaptador que comvierte Volt120 a Volt12
    static class VoltAdapter implements Volt12{
        private Volt120 volt120;
        
        public VoltAdapter(Volt120 volt120){
            this.volt120 = volt120;
        }
        @Override
        public int getVolt12(){
            return volt120.getVolt120()/10;
        }
        
        //uso del adaptador 
        public static void main(String[] args){
            Volt120 oldSystem= new Volt120();
            Volt12 adaptedSystem= new VoltAdapter(oldSystem);
            System.out.println("Voltaje adaptado_"+ adaptedSystem.getVolt12()+ "V");
        }
    }
}
