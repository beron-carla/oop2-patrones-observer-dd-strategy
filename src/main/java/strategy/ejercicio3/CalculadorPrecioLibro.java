package strategy.ejercicio3;

public class CalculadorPrecioLibro implements CalculadorDePrecio {
    private double impuestos;
    private double descuentos;
    private boolean envioGratis;

    public CalculadorPrecioLibro(double impuestos, double descuentos) {
        this.impuestos = impuestos;
        this.descuentos = descuentos;
        envioGratis = false;
    }

    @Override
    public double calcularPrecio(double precioProducto) {
        setEnvioGratis(precioProducto);
        double total = calculoConImpuestoYdescuento(precioProducto);
        total = descuentoEnvioGratis(total);
        return total;
    }

    private double calculoConImpuestoYdescuento(double precioProducto) {
        return precioProducto * (1 + impuestos) * (1 - descuentos);
    }

    private double descuentoEnvioGratis(double total) {
        if (this.envioGratis) {
            total -= 10;
        }
        return total;
    }

    private void setEnvioGratis(double precioProducto) {
        if (precioProducto > 100) {
            this.envioGratis = true;
        }
    }

//        //calculadorDePrecioLibro
//        if (tipo == TipoProducto.LIBRO) {
//            impuestos = 0.1;
//            descuentos = 0.1;
//            if (precio > 100) {
//                envioGratis = true;
//            }
    //        double total = precio * (1 + impuestos) * (1 - descuentos);
//        if (envioGratis) {
//            total -= 10;
//        }
//        return total;
}
