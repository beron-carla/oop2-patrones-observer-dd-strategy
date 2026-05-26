package dd.ejercicio2;

public abstract class Cargo {

    public abstract boolean puedeSerAgregadoPor(Director jefe);

    public abstract boolean puedeSerAgregadoPor(MandoMedio jefe);

    public abstract boolean agregarA(Empleado empleado);
}
