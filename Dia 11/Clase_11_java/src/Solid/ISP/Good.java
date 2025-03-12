/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solid.ISP;

/**
 *
 * @author Uniminuto Tibu
 */
public class Good {
    interface workable {
        void work();
    }
    interface Eatable{
        void eat();
    }
    class Human implements workable,Eatable{
        public void work(){
            System.out.println("Trabajando");
        }
        public void eat(){
            System.out.println("Comiendo");
        }
    }
    class Robot implements workable{
        public void work(){
            System.out.println("Trabajando");
        }
    }
    
}
