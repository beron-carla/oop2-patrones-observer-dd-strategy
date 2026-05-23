package dd.ejercicio5opcion2IA;

public abstract class Tipo {

    // Recibe el estado concreto — dos sobrecargas por estado
    // El compilador elige según el tipo real de estado
    public abstract int calcularDuracionPrestamo(Nuevo estado, Articulo articulo);

    public abstract int calcularDuracionPrestamo(Usado estado, Articulo articulo);

    public abstract int calcularDuracionPrestamo(Deteriorado estado, Articulo articulo);
}
