package dd.ejercicio5;

public class Libro extends Tipo {

    @Override
    public int calcularDuracionPrestamo(Articulo articulo) {
        var total = 0;
        var cantPaginas = articulo.cantPaginas();
        //calcular,//Libro: 1 día cada 100 páginas, redondeando hacia arriba.

        return total;
    }
}
