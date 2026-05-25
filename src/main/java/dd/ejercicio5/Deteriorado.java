package dd.ejercicio5;

public class Deteriorado extends Condicion {

    @Override
    public int diasParaLibro(Libro libro) {
        return (int) Math.ceil(libro.cantPaginas() / 100.0);
    }

    @Override
    public int diasParaDisco(Disco disco) {
        if (disco.anio() < 1980) {
            throw new RuntimeException("El disco no se puede prestar en estado deteriorado");
        }
        return Math.max(1, (disco.anio() < 1980 ? 3 : 5) - 1);
    }

    @Override
    public int diasParaRevista(Revista revista) {
        int total = revista.cantPaginas() < 100 ? 2 :
                revista.cantPaginas() < 2000 ? 3 : 5;
        int reduccion = revista.aniosDesdePublicacion() > 10 ? 3 : 1;
        return Math.max(1, total - reduccion);
    }
}
