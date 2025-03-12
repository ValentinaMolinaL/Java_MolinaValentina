/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solid.LSP;

/**
 *
 * @author Uniminuto Tibu
 */
public class Bad {
    //liskov subtitucion principle (LSP) PRINCIPIO DE SUSTITUCION de liskov
    //las clases derivadas deben poder sustituir a sus clases base sin alterar el comportamiento del programa
    class Bird {
        public void fly(){
            System.out.println("Volando...");
        }
    }
    class Penguin extends Bird{
        @Override
        public void fly(){
            throw new UnsupportedOperationException("los pinguinos no pueden volar");
        }
    }
    
}
