package Ejer2;

import java.util.ArrayList;
import java.util.List;

public class FiltroClientes {

	public List<Cliente> filtroPorLocalidad(List<Cliente> clientes, Localidad localidad) {
		List<Cliente> filteredList = new ArrayList<Cliente>();
		for (Cliente cliente : clientes) {
			if (cliente.localidad == localidad) {
				filteredList.add(cliente);
			}
		}
		return filteredList;
	}

	public List<Cliente> filtroPorNombre(List<Cliente> clientes, String nombre) {
		List<Cliente> filteredList = new ArrayList<Cliente>();
		for (Cliente cliente : clientes) {
			if (cliente.nombre == nombre) {
				filteredList.add(cliente);
			}
		}
		return filteredList;
	}

	public List<Cliente> filtroConSaldo(List<Cliente> clientes) {
		List<Cliente> filteredList = new ArrayList<Cliente>();
		for (Cliente cliente : clientes) {
			if (cliente.saldo > 0) {
				filteredList.add(cliente);
			}
		}
		return filteredList;
	}
}
