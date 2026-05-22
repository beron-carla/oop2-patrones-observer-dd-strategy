package dd.ejercicio2;

public abstract class Empleado {
    public abstract float calcularSalario();

    public abstract Cargo cargo();

    public abstract void puedeSerAgregadoPorDirector(Director jefe);

    public abstract void puedeSerAgregadoPorMandoMedio(MandoMedio jefe);

}
