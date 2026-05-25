package dd.ejercicio4;

import java.util.List;

public class Cliente {
    private List<Producto> compra;
    private String nombre;
    private TipoCliente tipo;

    public Cliente(String nombre, TipoCliente tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public TipoCliente tipo() {
        return tipo;
    }

}
