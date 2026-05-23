package dd.ejercicio2;

public class Director extends Cargo {

    //OPCION 1 : LANZANDO EXCEPCIONES
//    @Override
//    public void puedeSerAgregadoPor(Director jefe) {
//        throw new RuntimeException("No puede ser subordinado de un Director");
//    }
//
//    @Override
//    public void puedeSerAgregadoPor(MandoMedio jefe) {
//        throw new RuntimeException("No puede ser subordinado de un Mando Medio");
//    }
//
//    @Override
//    public void validarSubordinado(Empleado subordinado) {
//        subordinado.puedeSerAgregadoPorDirector(this);
//    }
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
