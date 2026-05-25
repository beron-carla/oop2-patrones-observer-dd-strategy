package strategy.ejercicio1;


import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<ProductoFisico> productos;
    private Cliente cliente;

    public Carrito(Cliente cliente) {

        this.productos = new ArrayList<>();
        this.cliente = cliente;
    }


    public void agregarProducto(ProductoFisico producto) {
        productos.add(producto);
    }

    public float calcularTotalProductos() {
        float total = 0;
        for (ProductoFisico producto : this.productos) {
            total = total + producto.precioBase();
        }
        return total;
    }

    public float calcularPesoTotal() {
        float pesoTotal = 0;
        for (ProductoFisico producto : this.productos) {
            pesoTotal = pesoTotal + producto.peso();
        }
        return pesoTotal;
    }

}
