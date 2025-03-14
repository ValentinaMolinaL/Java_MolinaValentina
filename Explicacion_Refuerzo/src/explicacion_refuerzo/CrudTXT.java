
package explicacion_refuerzo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CrudTXT {
    private static String archivo = "./src/CRUD/data.txt";
    private static List<Persona> personas= new ArrayList<>();
    private static List<Producto> producto= new ArrayList<>();
    
    //Cargar los datos persistentes
    public static void cargaDatos(){
        personas.clear();
        producto.clear();
        
        try (BufferedReader reader =new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea=reader.readLine())!=null){
                if(linea.startsWith("P")){
                    personas.add(Persona.fromString(linea));
                }else if(linea.startsWith("PR")){
                    producto.add(Producto.fromString(linea));
                }
            }
        }
        catch (Exception e) {
            System.out.println("no se puede cargar el archiv. se procede a ccrear uno nuevo");
        }
        
    }
    
    public static void listaPersonas(){
        if (personas.isEmpty()){
            System.out.println("no se puede listar personas porque no hay");
        }
        else{
            for(Persona persona : personas){
                System.out.println(persona);
            }
        }
    }

    
    
}
