
package liga_de_baloncesto;

import java.util.Date;

public class Partido_PlayOffs extends Partido {
    private String ronda;

    public Partido_PlayOffs(String equipoLocal, String equipoVisitante, Date fecha, String ronda) {
        super(equipoLocal, equipoVisitante, fecha);
        this.ronda = ronda;
    }

    @Override
    public void finalizarPartido() {
        if (getCestasLocal() == getCestasVisitante()) {
            System.out.println("No se puede finalizar el partido. Hay un empate.");
        } else {
            super.finalizarPartido();
        }
    }

    @Override
    public String obtenerInformacionPartido() {
        return super.obtenerInformacionPartido() + "\nRonda: " + ronda;
    }
}