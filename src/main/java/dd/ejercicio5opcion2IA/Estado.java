package dd.ejercicio5opcion2IA;

public abstract class Estado {

    // 1° dispatch — cada Estado se pasa a sí mismo al Tipo
    public abstract int calcularDuracionPrestamo(Articulo articulo);

    // 2° dispatch — sobrecargas por tipo concreto de artículo
    // Por defecto devuelve 0 — cada subclase sobreescribe lo que necesita
    public int calcularDuracionLibro(Libro tipo, Articulo articulo) {
        return 0;
    }

    public int calcularDuracionDisco(Disco tipo, Articulo articulo) {
        return 0;
    }

    public int calcularDuracionRevista(Revista tipo, Articulo articulo) {
        return 0;
    }
}
