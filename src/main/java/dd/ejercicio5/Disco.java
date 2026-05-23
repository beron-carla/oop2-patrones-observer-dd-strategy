package dd.ejercicio5;


public class Disco extends Tipo {

    @Override
    public int calcularDuracionPrestamo(Articulo articulo) {
        var total = 0;
        var estado = articulo.estado();
        var anio = articulo.anio();
        //calcular - falta calculo

        //Disco: Si su condición es deteriorada y la banda musical es menor a 1980, no
        //se puede prestar. Si su condición es deteriorada y la banda musical es mayor o igual
        //a 1980, se le resta 1 día al cálculo de días ( mínimo 1 día). En otra condición 3 días
        //si el año de creación de la banda musical es menor a 1980, 5 días en otro caso.

        return total;
    }
}
