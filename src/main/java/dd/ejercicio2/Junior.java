package dd.ejercicio2;


public class Junior extends Cargo {
    public static final String VALIDA_DIRECTOR = "Como director solo mandos medios pueden estar a mi cargo";

    @Override
    public void puedeSerAgregadoPorDirector(Director jefe) {
        throw new RuntimeException(VALIDA_DIRECTOR);
    }

    @Override
    public void puedeSerAgregadoPorMandoMedio(MandoMedio jefe) {
        //Valido
    }

    @Override
    public void validarSubordinado(Empleado subordinado) {
        throw new RuntimeException("Un Junior no puede tener subordinados");
    }


}
