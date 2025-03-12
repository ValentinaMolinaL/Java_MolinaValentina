
package Composite;
// composite 
// permite tratar objetos individuales y composicionesde objetos 
// de manera uniforme 

import java.util.ArrayList;
import java.util.List;

//Ejemplo: jerarquias de Empleados 
public class main {
    // Componente
    static abstract class Employee{
        protected String name;
        protected String position;
        
        public Employee(String name, String position){
            this.name=name;
            this.position=position;
        }
        
        abstract void showDetails();
    }
    
    //hoja
    static class Developer extends Employee{
        public Developer(String name){
            super(name, "desarrollador");
        }
        
        @Override
        void showDetails(){
            System.out.println(position + ": " + name);
        }
    }
    //Compuesto 
    static class Manager extends Employee {
        private List<Employee> subordinates = new ArrayList<>();
        
        public Manager(String name){super(name, "gerente");}
        
        
        
        public void addEmployee (Employee emp){subordinates.add(emp);
        
        @Override
        void showDetails(){
            System.out.println(position+": "+name );
            for (Employee e : subordinates){
                e.showDetails();
            }
        }
    }
        
    // uso del patron Composie
        public static void main(String[] args){
            Manager manager = new Manager("carlos");
            manager.addEmployee(new Developer("ana"));
            manager.addEmployee(new Developer("juan"));
            
            manager.showDetails();
        }
    }
    
}
