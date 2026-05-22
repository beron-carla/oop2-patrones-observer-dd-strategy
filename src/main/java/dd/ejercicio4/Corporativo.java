package dd.ejercicio4;

public class Corporativo extends TipoCliente {

    public static final float COEFICIENTE = 0.5f;

    //Corporativo tiene 50% de descuento en envio fisico
    @Override
    public float costoEnvioProductoFisico(ProductoFisico productoFisico) {
        float costo = productoFisico.precioBase() * productoFisico.peso();
        return costo - (costo * COEFICIENTE);

        //hereda otros metodos
    }
}
