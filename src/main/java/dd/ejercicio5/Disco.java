package dd.ejercicio5;


public class Disco extends Articulo {

    private int anioInicioBanda;

    public Disco(String nombre, Condicion condicion, int anioInicioBanda) {
        super(nombre, condicion);
        this.anioInicioBanda = anioInicioBanda;

    }

    public int anio() {
        return anioInicioBanda;
    }

    //1er dispatch this: Disco
    //el compilador elige diasParaDisco(Disco) 2do Dispatch
    @Override
    public int prestarSegun(Condicion condicion) {
        return condicion.diasParaDisco(this);
    }

}
