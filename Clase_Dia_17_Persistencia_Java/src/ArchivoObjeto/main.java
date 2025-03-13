package ArchivoObjeto;

import static ArchivoObjeto.CRUDPersistencia.actualizarPersona;
import static ArchivoObjeto.CRUDPersistencia.agregarPersona;
import static ArchivoObjeto.CRUDPersistencia.cargarDatos;
import static ArchivoObjeto.CRUDPersistencia.eliminarPersona;
import static ArchivoObjeto.CRUDPersistencia.guardarDatos;
import static ArchivoObjeto.CRUDPersistencia.listarPersonas;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        cargarDatos();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- CRUD Personas ---");
            System.out.println("1. Agregar Persona");
            System.out.println("2. Listar Personas");
            System.out.println("3. Actualizar Persona");
            System.out.println("4. Eliminar Persona");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    agregarPersona(id, nombre, edad);
                    guardarDatos();
                    break;

                case 2:
                    listarPersonas();
                    break;

                case 3:
                    System.out.print("ID de la persona a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva edad: ");
                    int nuevaEdad = sc.nextInt();
                    actualizarPersona(idActualizar, nuevoNombre, nuevaEdad);
                    guardarDatos();
                    break;

                case 4:
                    System.out.print("ID de la persona a eliminar: ");
                    int idEliminar = sc.nextInt();
                    eliminarPersona(idEliminar);
                    guardarDatos();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
