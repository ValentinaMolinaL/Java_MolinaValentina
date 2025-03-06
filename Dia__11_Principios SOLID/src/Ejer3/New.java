package Ejer3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum Localidad {
    NONE,
    BAHIA_BLANCA,
    TRES_ARROYOS
}

public class Cliente {
    public String nombre;
    public Localidad localidad;
    public float saldo;
    // getters, setters...

    public Cliente(String nombre, Localidad localidad, float saldo) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public float getSaldo() {
        return saldo;
    }
}

// Principio de Responsabilidad Única (SRP)
interface FiltroCliente {
    List<Cliente> filtrar(List<Cliente> clientes);
}

// Principio de Responsabilidad Única (SRP)
class FiltroPorLocalidad implements FiltroCliente {
    private Localidad localidad;

    public FiltroPorLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    @Override
    public List<Cliente> filtrar(List<Cliente> clientes) {
        return clientes.stream()
                .filter(cliente -> cliente.getLocalidad() == localidad)
                .collect(Collectors.toList());
    }
}

// Principio de Responsabilidad Única (SRP)
class FiltroPorNombre implements FiltroCliente {
    private String nombre;

    public FiltroPorNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public List<Cliente> filtrar(List<Cliente> clientes) {
        return clientes.stream()
                .filter(cliente -> cliente.getNombre().equals(nombre))
                .collect(Collectors.toList());
    }
}

// Principio de Responsabilidad Única (SRP)
class FiltroConSaldo implements FiltroCliente {
    @Override
    public List<Cliente> filtrar(List<Cliente> clientes) {
        return clientes.stream()
                .filter(cliente -> cliente.getSaldo() > 0)
                .collect(Collectors.toList());
    }
}

// Principio de Responsabilidad Única (SRP)
class LogicaClientes {
    private List<Cliente> clientes = new ArrayList<>();

    public LogicaClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Cliente> getClientesPorLocalidad(Localidad localidad) {
        return new FiltroPorLocalidad(localidad).filtrar(clientes);
    }

    public List<Cliente> getClientesPorNombre(String nombre) {
        return new FiltroPorNombre(nombre).filtrar(clientes);
    }

    public List<Cliente> getClientesConSaldo() {
        return new FiltroConSaldo().filtrar(clientes);
    }
}