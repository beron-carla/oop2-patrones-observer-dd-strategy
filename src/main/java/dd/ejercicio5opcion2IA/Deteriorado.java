package dd.ejercicio5opcion2IA;

public class Deteriorado extends Estado {

    @Override
    public int calcularDuracionPrestamo(Articulo articulo) {
        return articulo.tipo().calcularDuracionPrestamo(this, articulo);
    }

    // Libro deteriorado: mismo cálculo
    @Override
    public int calcularDuracionLibro(Libro tipo, Articulo articulo) {
        return (int) Math.ceil(articulo.cantPaginas() / 100.0);
    }

    // Disco deteriorado: banda < 1980 no se puede prestar
    @Override
    public int calcularDuracionDisco(Disco tipo, Articulo articulo) {
        if (articulo.anio() < 1980) {
            throw new RuntimeException("El disco no se puede prestar en estado deteriorado");
        }
        return Math.max(1, (articulo.anio() < 1980 ? 3 : 5) - 1);
    }

    // Revista deteriorada: resta días según antigüedad
    @Override
    public int calcularDuracionRevista(Revista tipo, Articulo articulo) {
        int total = articulo.cantPaginas() < 100 ? 2 :
                articulo.cantPaginas() < 2000 ? 3 : 5;
        int reduccion = articulo.aniosDesdePublicacion() > 10 ? 3 : 1;
        return Math.max(1, total - reduccion);
    }
}
