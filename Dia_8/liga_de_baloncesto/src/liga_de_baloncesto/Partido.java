
package liga_de_baloncesto;

import java.util.Date;

//Creacion de clase madre
public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private int cestasLocal;
    private int cestasVisitante;
    private boolean finalizado;
    private Date fecha;
    

    public Partido(String equipoLocal, String equipoVisitante, Date fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.cestasLocal = 0;
        this.cestasVisitante = 0;
        this.finalizado = false;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getCestasLocal() {
        return cestasLocal;
    }

    public int getCestasVisitante() {
        return cestasVisitante;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void registrarPuntosLocal(int puntos) {
        this.cestasLocal += puntos;
    }

    public void registrarPuntosVisitante(int puntos) {
        this.cestasVisitante += puntos;
    }

    public String obtenerResultado() {
        return equipoLocal + " " + cestasLocal + " - " + cestasVisitante + " " + equipoVisitante;
    }

    public String obtenerGanador() {
        if (cestasLocal > cestasVisitante) {
            return equipoLocal;
        } else if (cestasVisitante > cestasLocal) {
            return equipoVisitante;
        } else {
            return "Empate";
        }
    }

    public void finalizarPartido() {
        this.finalizado = true;
    }

    public String obtenerInformacionPartido() {
        return "Equipo Local: " + equipoLocal + "\n" +
                "Equipo Visitante: " + equipoVisitante + "\n" +
                "Cestas Local: " + cestasLocal + "\n" +
                "Cestas Visitante: " + cestasVisitante + "\n" +
                "Finalizado: " + finalizado + "\n" +
                "Fecha: " + fecha;
    }
}