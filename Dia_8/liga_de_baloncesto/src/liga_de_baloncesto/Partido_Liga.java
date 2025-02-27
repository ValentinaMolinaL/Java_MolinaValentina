
package liga_de_baloncesto;

import java.util.Date;

public class Partido_Liga extends Partido {
    private int jornada;

    public Partido_Liga(String equipoLocal, String equipoVisitante, Date fecha, int jornada) {
        super(equipoLocal, equipoVisitante, fecha);
        this.jornada = jornada;
    }

    @Override
    public String obtenerInformacionPartido() {
        return super.obtenerInformacionPartido() + "\nJornada: " + jornada;
    }
}