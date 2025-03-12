package Ejer2;

import java.util.ArrayList;
import java.util.List;

public class LogicaClientes {

	private FiltroClientes filtro = new FiltroClientes();
	
	private List<Cliente> clientes =  new ArrayList<Cliente>();

	public List<Cliente> getClientes() {
		return clientes;
	}
	

	// ...
	
	public List<Cliente> getClientesPorLocalidad(Localidad localidad) {
		return filtro.filtroPorLocalidad(clientes, localidad);
	}
	
	public List<Cliente> getClientesPorNombre(String nombre) {
		return filtro.filtroPorNombre(clientes, nombre);
	}
	
	public List<Cliente> getClientesConSaldo() {
		return filtro.filtroConSaldo(clientes);
	}
	
	// ...
}
