package dd.ejercicio4;

public interface Producto {

    float precioBase();

    float iva();

    float peso();

    //1° dispatch: el producto sabe qué sobrecarga del cliente llamar
    float costoEnvio(TipoCliente tipo);

    float impuesto(TipoCliente tipo);


}
