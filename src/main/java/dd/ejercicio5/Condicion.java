package dd.ejercicio5;


public abstract class Condicion {

    // 2° dispatch — sobrecargas por tipo concreto de artículo
    // El compilador elige según el this que se pasa
    public abstract int diasParaLibro(Libro libro);

    public abstract int diasParaDisco(Disco disco);

    public abstract int diasParaRevista(Revista revista);
}