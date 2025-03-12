package Ejer2;

public class Mail {
	
	private String auditor;
	private String mensaje;

	public Mail to(String auditor) {
		this.auditor = auditor;
		return this;
	}

	public Mail withBody(String mensaje) {
		this.mensaje = mensaje;
		return this;
	}

	public String getAuditor() {
		return auditor;
	}

	public String getMensaje() {
		return mensaje;
	} 

    String getBody() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
