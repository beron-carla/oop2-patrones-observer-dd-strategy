package dd.ejercicio2;

public class MandoMedio extends Cargo {

    //Mando Medio acepta ser subordinado de Director

    @Override
    public void puedeSerAgregadoPor(Director jefe) {
        //Válido
    }

    @Override
    public void puedeSerAgregadoPor(MandoMedio jefe) {
        throw new RuntimeException("No puede ser subordinado de Mando Medio");
    }

    @Override
    public void validarSubordinado(Empleado subordinado) {
        subordinado.puedeSerAgregadoPorMandoMedio(this);
    }


}
