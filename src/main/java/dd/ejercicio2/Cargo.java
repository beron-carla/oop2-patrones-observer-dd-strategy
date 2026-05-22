package dd.ejercicio2;

public abstract class Cargo {
    //por defecto

    //parametro - nombre
    public abstract void puedeSerAgregadoPor(Director jefe);

    public abstract void puedeSerAgregadoPor(MandoMedio jefe);

    //1° dispatch - cada cargo sabe a quien llamar
    public abstract void validarSubordinado(Empleado subordinado);
}
