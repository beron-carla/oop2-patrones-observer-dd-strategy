package dd.ejercicio2;

public class MandoMedio extends Cargo {
    @Override
    public boolean puedeSerAgregadoPor(Director jefe) {
        return true; //Mando medio puede ser subordinado de Director
    }

    @Override
    public boolean puedeSerAgregadoPor(MandoMedio jefe) {
        return false;  //Mando medio no puede ser subordinado de Mando medio
    }

    @Override
    public boolean agregarA(Empleado empleado) {
        return empleado.puedeSerAgregadoPor(this);
    }

    @Override
    public String toString() {
        return "Mando Medio";
    }
    //OPCION 2 LANZANDO EXCEPCIONES
//    @Override
//    public void puedeSerAgregadoPor(Director jefe) {
//        //Válido
//    }
//
//    @Override
//    public void puedeSerAgregadoPor(MandoMedio jefe) {
//        throw new RuntimeException("No puede ser subordinado de Mando Medio");
//    }
//
//    @Override
//    public void validarSubordinado(Empleado subordinado) {
//        subordinado.puedeSerAgregadoPorMandoMedio(this);
//    }


}
