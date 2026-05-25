package dd.ejercicio5;

public class Libro extends Articulo {

    private int cantPaginas;

    public Libro(String nombre, Condicion condicion, int cantPaginas) {
        super(nombre, condicion);
        this.cantPaginas = cantPaginas;
    }

    public int cantPaginas() {
        return cantPaginas;
    }

    // 1° dispatch: this = Libro
    // compilador elige diasParaLibro(Libro) — 2° dispatch
    @Override
    public int prestarSegun(Condicion condicion) {
        return condicion.diasParaLibro(this);
    }
}