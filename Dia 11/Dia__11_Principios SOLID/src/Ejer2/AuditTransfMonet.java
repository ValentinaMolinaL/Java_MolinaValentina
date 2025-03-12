package Ejer2;

import Ejer2.Transferencia;
// Principio de Responsabilidad Única (SRP)
interface NotificadorTransferencia {
    void notificar(Transferencia transferencia);
}

class NotTraImp implements NotificadorTransferencia {
    private ServicioMensaje servicioMensaje;
    private EnviarMensaje enviarMensaje;

    public NotTraImp(ServicioMensaje servicioMensaje, EnviarMensaje enviarMensaje) {
        this.servicioMensaje = servicioMensaje;
        this.enviarMensaje = enviarMensaje;
    }

    @Override
    public void notificar(Transferencia transferencia) {
        String auditor = servicioMensaje.obtenerDireccionMailAuditor();
        String mensaje = servicioMensaje.componerMensajeAviso(transferencia);
        enviarMensaje.enviarMensaje(auditor, mensaje);
    }
}

// Principio de Responsabilidad Única (SRP)
class AuditTransfMonet {
    private ComprobarMonto comprobarMonto;
    private NotificadorTransferencia notificadorTransferencia;

    public AuditTransfMonet(ComprobarMonto comprobarMonto, NotificadorTransferencia notificadorTransferencia) {
        this.comprobarMonto = comprobarMonto;
        this.notificadorTransferencia = notificadorTransferencia;
    }

    public boolean transferenciaRealizada(Transferencia transferencia) {
        if (comprobarMonto.esTransferenciaImportante(transferencia)) {
            notificadorTransferencia.notificar(transferencia);
        }
        return false;
    }
}

// Principio de Responsabilidad Única (SRP)
class ComprobarMonto {
    public boolean esTransferenciaImportante(Transferencia transferencia) {
        return transferencia.importe() > 50000;
    }
}

// Principio de Responsabilidad Única (SRP) y Abierto/Cerrado (OCP)
class EnviarMensaje {
    private ConectarCorreo conectarCorreo;

    public EnviarMensaje(ConectarCorreo conectarCorreo) {
        this.conectarCorreo = conectarCorreo;
    }

    public void enviarMensaje(String destinatario, String mensaje) {
        ConexionMail conexionMail = conectarCorreo.abrirConexionMail();
        try {
            conexionMail.enviar(new Mail().to(destinatario).withBody(mensaje));
        } finally {
            if (conexionMail != null) conexionMail.cerrar();
            System.out.println("Mensaje enviado con éxito");
        }
    }
}

// Principio de Responsabilidad Única (SRP)
class ServicioMensaje {
    public String obtenerDireccionMailAuditor() {
        return "mail-auditor";
    }

    public String componerMensajeAviso(Transferencia transferencia) {
        return "aviso-transferencia-importante";
    }
}

// Principio de Responsabilidad Única (SRP)
class ConectarCorreo {
    public ConexionMail abrirConexionMail() {
        return ConexionMail.getInstance();
    }
}