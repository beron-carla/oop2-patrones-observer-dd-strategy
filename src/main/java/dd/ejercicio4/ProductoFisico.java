package dd.ejercicio4;

public class ProductoFisico implements Producto {
    private float precio;
    private float iva;
    private String nombre;
    private int peso;

    public ProductoFisico(String nombre, float precio, int peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.peso = peso;
        this.iva = 0.21f;
    }

    @Override
    public float precioBase() {
        return precio;
    }

    @Override
    public float iva() {
        return this.iva;
    }

    @Override
    public float peso() {
        return this.peso;
    }

    @Override
    public float costoEnvio(TipoCliente tipo) { //1° dispatch - sabe a que tipo llamar
//        var costo = this.precio * peso;
//        if (tipo.equals(TipoCliente.CORPORATIVO)) {
//            return costo - (costo * 0.5f);
//        }
        return tipo.costoEnvioProductoFisico(this);
    }

    @Override
    public float impuesto(TipoCliente tipo) {

        return tipo.impuestoProductoFisico(this);
    }
}
