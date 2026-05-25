package dd.ejercicio5;

public class Usado extends Condicion {

    @Override
    public int diasParaLibro(Libro libro) {
        return (int) Math.ceil(libro.cantPaginas() / 100.0);
    }

    @Override
    public int diasParaDisco(Disco disco) {
        return disco.anio() < 1980 ? 3 : 5;
    }

    @Override
    public int diasParaRevista(Revista revista) {
        if (revista.cantPaginas() < 100) return 2;
        if (revista.cantPaginas() < 2000) return 3;
        return 5;
    }
}