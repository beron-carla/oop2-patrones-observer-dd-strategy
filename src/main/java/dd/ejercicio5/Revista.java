package dd.ejercicio5;

import static java.time.LocalDate.now;

public class Revista extends Tipo {

    private static int incrementaEnFuncionDeLaCantidadPaginas(Articulo articulo, int total) {

        if (articulo.cantPaginas() < 100) {
            return total + 1;
        }
        if (articulo.cantPaginas() > 100 && articulo.cantPaginas() < 2000) {
            total = total + 2;
        }
        if (articulo.cantPaginas() > 2000) {
            total = total + 4;
        }
        return total;
    }

    @Override
    public int calcularDuracionPrestamo(Articulo articulo) {

        var totalDias = 1;
        totalDias = incrementaEnFuncionDeLaCantidadPaginas(articulo, totalDias);
        totalDias = decrementaEnFuncionDeEstadoYFechaDePublicacion(articulo, totalDias);

        return totalDias;
    }

    private int decrementaEnFuncionDeEstadoYFechaDePublicacion(Articulo articulo, int total) {
        if (articulo.estado() == Estado.DETERIORADO && cantidadAniosDesdePublicacion(articulo) > 10) {
            total = total - 3;
        } else {
            total = total - 1;
        }
        return total;
    }

    private int cantidadAniosDesdePublicacion(Articulo articulo) {

        var fechaPublicacion = articulo.fechaPublicacion().getYear();
        int aniosDesdePublicacion = now().getYear() - fechaPublicacion;
        return aniosDesdePublicacion;

    }


}
