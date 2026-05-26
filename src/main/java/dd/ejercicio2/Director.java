package dd.ejercicio2;

public class Director extends Cargo {

    @Override
    public boolean puedeSerAgregadoPor(Director jefe) {
        return false;
    }

    @Override
    public boolean puedeSerAgregadoPor(MandoMedio jefe) {
        return false;
    }

    @Override
    public boolean agregarA(Empleado empleado) {
        return empleado.puedeSerAgregadoPor(this);
    }

    @Override
    public String toString() {
        return "Director";
    }
}
