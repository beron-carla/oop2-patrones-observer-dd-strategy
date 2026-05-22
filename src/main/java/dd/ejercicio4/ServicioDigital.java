package dd.ejercicio4;

public class ServicioDigital implements Producto {
    private float precio;
    private String nombre;
    private float iva;

    public ServicioDigital(String nombre, float precio, float iva) {
        this.precio = precio;
        this.nombre = nombre;
        this.iva = iva;
    }


    @Override
    public float precioBase() {
        return this.precio;
    }

    @Override
    public float iva() {
        return this.iva;
    }

    @Override
    public float peso() {
        return 0;
    }

    @Override
    public float costoEnvio(TipoCliente tipo) {
        return tipo.costoEnvioServicioDigital(this);
    }

    @Override
    public float impuesto(TipoCliente tipoCliente) {
//        if (tipo.equals(TipoCliente.REGULAR)) {
//            return this.precio * 0.10f;
        return tipoCliente.impuestoServicioDigital(this);
    }
}
