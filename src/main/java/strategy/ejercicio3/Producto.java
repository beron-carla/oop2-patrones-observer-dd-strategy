package strategy.ejercicio3;

import java.util.HashMap;
import java.util.Map;

enum TipoProducto {
    LIBRO,
    ALIMENTO,
    MEDICINA,
    OTRO
}

public class Producto {
    public TipoProducto tipo;
    public double precio;
    private Map<String, CalculadorDePrecio> estrategiasCalculo = new HashMap<>();

    public Producto(TipoProducto tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;

        this.estrategiasCalculo.put(TipoProducto.LIBRO.name(), new CalculadorPrecioLibro(0.1, 0.1));
        this.estrategiasCalculo.put(TipoProducto.MEDICINA.name(), new CalculadorPrecioMedicina(0, 0));
        this.estrategiasCalculo.put(TipoProducto.ALIMENTO.name(), new CalculadorPrecioAlimento(0, 0.05));
        this.estrategiasCalculo.put(TipoProducto.OTRO.name(), new CalculadorPrecioGenerico(0, 0.15));
    }

    public void assertTipoProductoValido() {
        if (!this.estrategiasCalculo.containsKey(this.tipo.name())) {
            throw new RuntimeException("Tipo de producto inexistente");
        }
    }

    public double precioFinal() {
        assertTipoProductoValido();
        return this.estrategiasCalculo.get(this.tipo.name()).calcularPrecio(this.precio);
    }
}
