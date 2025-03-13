
package ArchivoObjeto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CRUDPersistencia {
    private static final String ARCHIVO = "./src/ArchivoObjeto/data.txt";
    private static List<Persona> personas = new ArrayList<>();

    // Cargar datos desde el archivo
    public static void cargarDatos() {
        personas.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                personas.add(Persona.fromString(linea));
            }
        } catch (IOException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        }
    }

    // Guardar datos en el archivo
    public static void guardarDatos() {
        try (FileWriter writer = new FileWriter(ARCHIVO)) {
            for (Persona p : personas) {
                writer.write(p.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }

    // Crear
    public static void agregarPersona(int id, String nombre, int edad) {
        personas.add(new Persona(id, nombre, edad));
        guardarDatos();
    }

    // Leer
    public static void listarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas.");
        } else {
            for (Persona p : personas) {
                System.out.println(p.getId() + " - " + p.getNombre() + " - " + p.getEdad() + " años");
            }
        }
    }

    // Actualizar
    public static void actualizarPersona(int id, String nuevoNombre, int nuevaEdad) {
        for (Persona p : personas) {
            if (p.getId() == id) {
                p.setNombre(nuevoNombre);
                p.setEdad(nuevaEdad);
                guardarDatos();
                return;
            }
        }
        System.out.println("Persona con ID " + id + " no encontrada.");
    }

    // Eliminar
    public static void eliminarPersona(int id) {
        personas.removeIf(p -> p.getId() == id);
        guardarDatos();
    }
}