package dd.ejercicio5opcion2IA;


public class Revista extends Tipo {

    @Override
    public int calcularDuracionPrestamo(Nuevo estado, Articulo articulo) {
        return estado.calcularDuracionRevista(this, articulo);
    }

    @Override
    public int calcularDuracionPrestamo(Usado estado, Articulo articulo) {
        return estado.calcularDuracionRevista(this, articulo);
    }

    @Override
    public int calcularDuracionPrestamo(Deteriorado estado, Articulo articulo) {
        return estado.calcularDuracionRevista(this, articulo);
    }
}

