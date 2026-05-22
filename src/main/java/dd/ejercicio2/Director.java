package dd.ejercicio2;

public class Director extends Cargo {
    @Override
    public void puedeSerAgregadoPor(Director jefe) {
        throw new RuntimeException("No puede ser subordinado de un Director");
    }

    @Override
    public void puedeSerAgregadoPor(MandoMedio jefe) {
        throw new RuntimeException("No puede ser subordinado de un Mando Medio");
    }

    @Override
    public void validarSubordinado(Empleado subordinado) {
        subordinado.puedeSerAgregadoPorDirector(this);
    }

}
