package dd.ejercicio2;


public class Junior extends Cargo {
    public static final String VALIDA_DIRECTOR = "Como director solo mandos medios pueden estar a mi cargo";

    @Override
    public boolean puedeSerAgregadoPor(Director jefe) {
        return false; //Un Junior no puede ser subordinado de un Director
    }

    @Override
    public boolean puedeSerAgregadoPor(MandoMedio jefe) {
        return true; //Es válido
    }

    @Override
    public boolean agregarA(Empleado empleado) {
        return false; //un Junior no puede tener subordinados.
    }

    @Override
    public String toString() {
        return "Junior";
    }
    //Opcion 1 lanzando excepciones
//    @Override
//    public void puedeSerAgregadoPor(Director jefe) {
//        throw new RuntimeException(VALIDA_DIRECTOR);
//    }
//
//    @Override
//    public void puedeSerAgregadoPor(MandoMedio jefe) {
//        //Valido
//    }
//
//    @Override
//    public void validarSubordinado(Empleado subordinado) {
//        throw new RuntimeException("Un Junior no puede tener subordinados");
//    }


}
