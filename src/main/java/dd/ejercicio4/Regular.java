package dd.ejercicio4;

public class Regular extends TipoCliente {
    public static final float COEFICIENTE = 0.10f;

    //hereda otros metodos

    //regular para impuesto en servicio digital
    @Override
    public float impuestoServicioDigital(ServicioDigital producto) {
        return producto.precioBase() * COEFICIENTE;
    }
}
