package dd.ejercicio2;

public abstract class Cargo {
    //por defecto

    public abstract void puedeSerAgregadoPorDirector(Director jefe);

    public abstract void puedeSerAgregadoPorMandoMedio(MandoMedio jefe);

    //1° dispatch - cada cargo sabe a quien llamar
    public abstract void validarSubordinado(Empleado subordinado);
}
