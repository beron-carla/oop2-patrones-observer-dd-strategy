package strategy;

import dd.ejercicio4.Producto;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    List<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public float calcularTotalProductos() {
        float total = 0;
        for (Producto producto : this.productos) {
            total = total + producto.precioBase();
        }
        return total;
    }

    public float calcularPesoTotal() {
        float pesoTotal = 0;
        for (Producto producto : this.productos) {
            pesoTotal = pesoTotal + producto.peso();
        }
        return pesoTotal;
    }

}
