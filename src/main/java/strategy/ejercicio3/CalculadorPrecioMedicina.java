package strategy.ejercicio3;

public class CalculadorPrecioMedicina implements CalculadorDePrecio {
    private double descuentos;
    private double impuestos;
    private boolean envioGratis;

    public CalculadorPrecioMedicina(double descuentos, double impuestos) {
        this.descuentos = descuentos;
        this.impuestos = descuentos;
        this.envioGratis = false;
    }

    @Override
    public double calcularPrecio(double precioProducto) {
        setDescuentos(precioProducto);
        setEnvioGratis(precioProducto);
        double total = calculoConImpuestoYdescuento(precioProducto);
        total = descuentoEnvioGratis(total);
        return total;
    }

    private double descuentoEnvioGratis(double total) {
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }

    private double calculoConImpuestoYdescuento(double precioProducto) {
        return precioProducto * (1 + impuestos) * (1 - descuentos);
    }

    private void setEnvioGratis(double precioProducto) {
        if (precioProducto > 100) {
            this.envioGratis = true;
        }
    }

    private void setDescuentos(double precioProducto) {
        if (precioProducto > 50) {
            this.descuentos = 0.1;
        }
    }

}

