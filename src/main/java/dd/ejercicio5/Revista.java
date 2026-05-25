package dd.ejercicio5;

import java.time.LocalDate;

public class Revista extends Articulo {

    private int cantPaginas;
    private LocalDate fechaPublicacion;

    public Revista(String nombre, Condicion condicion, int cantPaginas, LocalDate fechaPublicacion) {
        super(nombre, condicion);
        this.cantPaginas = cantPaginas;
        this.fechaPublicacion = fechaPublicacion;
    }

    public int cantPaginas() {
        return cantPaginas;
    }

    public int aniosDesdePublicacion() {
        return LocalDate.now().getYear() - fechaPublicacion.getYear();
    }

    //primer dispatch this = Revista
    //compilador elige diasParaRevista(Revista) - 2do Dispatch
    @Override
    public int prestarSegun(Condicion condicion) {
        return condicion.diasParaRevista(this);
    }
}
