package dd.ejercicio2;

public abstract class Empleado {
    public abstract float calcularSalario();

    public abstract Cargo cargo();

    //OPCION 1 - LANZANDO EXCEPCIONES
//    public abstract void puedeSerAgregadoPorDirector(Director jefe);
//
//    public abstract void puedeSerAgregadoPorMandoMedio(MandoMedio jefe);

    //OPCION 2 : RETORNANDO BOOLEANO - SOBRECARGA DE METODO
    public abstract boolean puedeSerAgregadoPor(Director jefe);

    public abstract boolean puedeSerAgregadoPor(MandoMedio jefe);

}
