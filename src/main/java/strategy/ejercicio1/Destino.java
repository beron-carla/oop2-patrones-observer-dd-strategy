package strategy.ejercicio1;

public class Destino {
    private final String nombre;

    private Destino(String nombre) {
        this.nombre = nombre;
    }

    public static Destino capitalFederal() {
        return new Destino("capital federal");
    }

    public static Destino granBuenosAires() {
        return new Destino("gran buenos aires");
    }

    public static Destino of(String nombre) {
        return new Destino(nombre);
    }

    public boolean esCapitalFederal() {
        return nombre.equalsIgnoreCase("capital federal");
    }

    public boolean esGranBuenosAires() {
        return nombre.equalsIgnoreCase("gran buenos aires");
    }
}
