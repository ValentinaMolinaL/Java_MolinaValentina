package ayds.tp1.ej4;

public class ProcesadorDeOrdenes {

	public void procesar(Orden orden) {
		if (orden.Isvalid() && new Repositorio().grabar(orden)) {
			NotificarPorMail.getInstance().enviarMensajeDeConfirmacion(orden);
		}
	}
}
