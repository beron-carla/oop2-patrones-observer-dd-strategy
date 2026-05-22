package dd.ejercicio2;

public class Main {
    public static void main(String[] args) {

        var director = new EmpleadoJerarquico("DIRECTOR", 100, new Director());
        var mandoMedio = new EmpleadoJerarquico("MANDOMEDIO", 50, new MandoMedio());
        director.agregarEmpleado(mandoMedio);
        var junior = new EmpleadoRegular("Junior", 25, new Junior());
        director.agregarEmpleado(junior);
    }
}
