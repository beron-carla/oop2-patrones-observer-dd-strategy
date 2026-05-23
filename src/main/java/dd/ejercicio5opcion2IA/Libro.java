package dd.ejercicio5opcion2IA;

public class Libro extends Tipo {

    // 2° dispatch: this = Libro, compilador elige calcularDuracionLibro(Libro)
    @Override
    public int calcularDuracionPrestamo(Nuevo estado, Articulo articulo) {
        return estado.calcularDuracionLibro(this, articulo);
    }

    @Override
    public int calcularDuracionPrestamo(Usado estado, Articulo articulo) {
        return estado.calcularDuracionLibro(this, articulo);
    }

    @Override
    public int calcularDuracionPrestamo(Deteriorado estado, Articulo articulo) {
        return estado.calcularDuracionLibro(this, articulo);
    }
}