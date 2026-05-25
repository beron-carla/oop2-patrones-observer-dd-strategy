package strategy.ejercicio1;

public class ProductoFisico {
    private float precio;
    private String nombre;
    private int peso;

    public ProductoFisico(String nombre, float precio, int peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.peso = peso;

    }


    public float precioBase() {
        return precio;
    }

    public int peso() {
        return this.peso;
    }
}