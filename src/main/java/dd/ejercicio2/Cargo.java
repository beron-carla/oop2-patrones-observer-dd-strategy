package dd.ejercicio2;

public abstract class Cargo {

    //OPCION 1 - LANZANDO EXCEPCIONES EN CADA CARGO
//    public abstract void puedeSerAgregadoPor(Director jefe);
//
//    public abstract void puedeSerAgregadoPor(MandoMedio jefe);

    //1° dispatch - cada cargo sabe a quien llamar
//    public abstract void validarSubordinado(Empleado subordinado);

    //OPCION 2 - RETORNANDO BOOLEANO -
    public abstract boolean puedeSerAgregadoPor(Director jefe);

    public abstract boolean puedeSerAgregadoPor(MandoMedio jefe);

    public abstract boolean agregarA(Empleado empleado);
}
