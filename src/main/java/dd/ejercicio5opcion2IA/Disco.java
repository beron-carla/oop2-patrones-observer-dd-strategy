package dd.ejercicio5opcion2IA;

public class Disco extends Tipo {

    @Override
    public int calcularDuracionPrestamo(Nuevo estado, Articulo articulo) {
        return estado.calcularDuracionDisco(this, articulo);
    }

    @Override
    public int calcularDuracionPrestamo(Usado estado, Articulo articulo) {
        return estado.calcularDuracionDisco(this, articulo);
    }

    @Override
    public int calcularDuracionPrestamo(Deteriorado estado, Articulo articulo) {
        return estado.calcularDuracionDisco(this, articulo);
    }
}
