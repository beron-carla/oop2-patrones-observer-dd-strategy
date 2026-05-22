package dd.ejercicio2;

public class MandoMedio extends Cargo {

    //Mando Medio acepta ser subordinado de Director

    @Override
    public void puedeSerAgregadoPorDirector(Director jefe) {
        //Válido
    }

    @Override
    public void puedeSerAgregadoPorMandoMedio(MandoMedio jefe) {
        throw new RuntimeException("No puede ser subordinado de Mando Medio");
    }

    @Override
    public void validarSubordinado(Empleado subordinado) {
        subordinado.puedeSerAgregadoPorMandoMedio(this);
    }


}
