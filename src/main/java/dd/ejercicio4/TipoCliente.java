package dd.ejercicio4;


public abstract class TipoCliente {

    // Por defecto: comportamiento base
    // Cada subclase sobreescribe solo lo que cambia

    //se puede aplicar sobreCarga
    public float costoEnvioProductoFisico(ProductoFisico producto) {
        return producto.precioBase() * producto.peso();
    }

    public float impuestoProductoFisico(ProductoFisico producto) {
        return producto.precioBase() * producto.iva();
    }

    public float costoEnvioServicioDigital(ServicioDigital producto) {
        return 0;
    }

    public float impuestoServicioDigital(ServicioDigital producto) {
        return 0;
    }
}