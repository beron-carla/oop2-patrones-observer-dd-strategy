package dd.ejercicio2;

public abstract class Empleado {
    public abstract float calcularSalario();

    public abstract Cargo cargo();

    //SOBRECARGA DE METODO
    public abstract boolean puedeSerAgregadoPor(Director jefe);

    public abstract boolean puedeSerAgregadoPor(MandoMedio jefe);

}
