
package liga_de_baloncesto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Liga_de_baloncesto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Partido> partidos = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrar partido de liga");
            System.out.println("2. Registrar partido de playoffs");
            System.out.println("3. Finalizar partido");
            System.out.println("4. Mostrar ganador");
            System.out.println("5. Mostrar información del partido");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1 -> {
                    registrarPartidoLiga(scanner, partidos);
                }
                case 2 -> {
                    registrarPartidoPlayoffs(scanner, partidos);
                }
                case 3 -> {
                    finalizarPartido(scanner, partidos);
                }
                case 4 -> {
                    mostrarGanador(scanner, partidos);
                }
                case 5 -> {
                    mostrarInformacionPartido(scanner, partidos);
                }
                case 6 -> {
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private static void registrarPartidoLiga(Scanner scanner, List<Partido> partidos) {
        System.out.print("Equipo local: ");
        String local = scanner.nextLine();
        System.out.print("Equipo visitante: ");
        String visitante = scanner.nextLine();
        System.out.print("Jornada: ");
        int jornada = scanner.nextInt();
        scanner.nextLine();
        Date fecha = new Date();
        Partido partido = new Partido_Liga(local, visitante, fecha, jornada);
        partidos.add(partido);
        System.out.println("Partido de liga registrado.");
    }

    private static void registrarPartidoPlayoffs(Scanner scanner, List<Partido> partidos) {
        System.out.print("Equipo local: ");
        String local = scanner.nextLine();
        System.out.print("Equipo visitante: ");
        String visitante = scanner.nextLine();
        System.out.print("Ronda: ");
        String ronda = scanner.nextLine();
        Date fecha = new Date();
        Partido partido = new Partido_PlayOffs(local, visitante, fecha, ronda);
        partidos.add(partido);
        System.out.println("Partido de playoffs registrado.");
    }

    private static void finalizarPartido(Scanner scanner, List<Partido> partidos) {
        System.out.print("Índice del partido a finalizar: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        if (indice >= 0 && indice < partidos.size()) {
            Partido partido = partidos.get(indice);
            partido.finalizarPartido();
            System.out.println("Partido finalizado.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    private static void mostrarGanador(Scanner scanner, List<Partido> partidos) {
        System.out.print("Índice del partido: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        if (indice >= 0 && indice < partidos.size()) {
            Partido partido = partidos.get(indice);
            System.out.println("Ganador: " + partido.obtenerGanador());
        } else {
            System.out.println("Índice no válido.");
        }
    }

    private static void mostrarInformacionPartido(Scanner scanner, List<Partido> partidos) {
        System.out.print("Índice del partido: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        if (indice >= 0 && indice < partidos.size()) {
            Partido partido = partidos.get(indice);
            System.out.println(partido.obtenerInformacionPartido());
        } else {
            System.out.println("Índice no válido.");
        }
    }
}