package dd.ejercicio5opcion2IA;

public class Usado extends Estado {

    @Override
    public int calcularDuracionPrestamo(Articulo articulo) {
        return articulo.tipo().calcularDuracionPrestamo(this, articulo);
    }

    @Override
    public int calcularDuracionLibro(Libro tipo, Articulo articulo) {
        return (int) Math.ceil(articulo.cantPaginas() / 100.0);
    }

    @Override
    public int calcularDuracionDisco(Disco tipo, Articulo articulo) {
        return articulo.anio() < 1980 ? 3 : 5;
    }

    @Override
    public int calcularDuracionRevista(Revista tipo, Articulo articulo) {
        if (articulo.cantPaginas() < 100) return 2;
        if (articulo.cantPaginas() < 2000) return 3;
        return 5;
    }
}
