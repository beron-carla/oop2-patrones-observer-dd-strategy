package dd.ejercicio5;

public abstract class Articulo {
    private String nombre;
    private Condicion condicion;

    public Articulo(String nombre, Condicion condicion) {
        this.nombre = nombre;
        this.condicion = condicion;
    }

    public String nombre() {
        return this.nombre;
    }

    public Condicion condicion() {
        return this.condicion;
    }

    //1er dispatch - binding dinamico elige Libro, Disco o Revista
    public abstract int prestarSegun(Condicion condicion);

    //Punto de entrada, delega en la condicion
    public int calcularDuracionPrestamo() {
        return this.prestarSegun(this.condicion);
    }

}
