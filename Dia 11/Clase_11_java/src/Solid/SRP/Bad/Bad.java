
package Solid.SRP.Bad;

public class Bad {
    // 1. Single Responsibility Principle (SRP) Principio de Responsabilidad Única 
    //Una clase debe tener una única razón para cambiar 
    //, es decir, debe encargarse de una sola responsabilidad. 
    class Report { 
        
    public void generateReport() { 
    // Genera un informe 
    }
    public void saveToFile(String filename){
    // Guarda el informe en un archivo (Violación de SRP) 
    }
    //¿Qué está mal? La clase Report tiene dos responsabilidades: 
    //generar el informe y guardarlo en un archivo.
}
    
}
