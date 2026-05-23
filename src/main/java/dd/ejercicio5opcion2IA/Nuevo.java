package dd.ejercicio5opcion2IA;

public class Nuevo extends Estado {

    @Override
    public int calcularDuracionPrestamo(Articulo articulo) {
        // 1° dispatch: this = Nuevo, compilador elige calcularDuracionNuevo
        return articulo.tipo().calcularDuracionPrestamo(this, articulo);
    }

    // Libro: 1 día cada 100 páginas redondeando hacia arriba
    @Override
    public int calcularDuracionLibro(Libro tipo, Articulo articulo) {
        return (int) Math.ceil(articulo.cantPaginas() / 100.0);
    }

    // Disco: 3 días si banda < 1980, 5 días en otro caso
    @Override
    public int calcularDuracionDisco(Disco tipo, Articulo articulo) {
        return articulo.anio() < 1980 ? 3 : 5;
    }

    // Revista: según cantidad de páginas
    @Override
    public int calcularDuracionRevista(Revista tipo, Articulo articulo) {
        if (articulo.cantPaginas() < 100) return 2;
        if (articulo.cantPaginas() < 2000) return 3;
        return 5;
    }
}