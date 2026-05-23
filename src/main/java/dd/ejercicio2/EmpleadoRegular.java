package dd.ejercicio2;

public class EmpleadoRegular extends Empleado {
    public static final String VALIDA_DIRECTOR = "Como director solo mandos medios pueden estar a mi cargo";
    private static int contadorId = 0;
    private final String nombre;
    private int id;
    private float salario;
    private Cargo cargo;

    public EmpleadoRegular(String nombre, float salario, Cargo cargo) {
        this.id = ++contadorId;
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public float salario() {
        return this.salario;
    }

    @Override
    public float calcularSalario() {
        return this.salario;
    }

    @Override
    public Cargo cargo() {
        return this.cargo;
    }

    @Override
    public boolean puedeSerAgregadoPor(Director jefe) {
        return false;
    }

    @Override
    public boolean puedeSerAgregadoPor(MandoMedio jefe) {
        return this.cargo.puedeSerAgregadoPor(jefe);
    }

    @Override
    public String toString() {
        return this.cargo.toString();
    }
    //OPCION 1 - LANZANDO EXCEPCIONES
//    @Override
//    public void puedeSerAgregadoPorDirector(Director jefe) {
//        throw new RuntimeException(VALIDA_DIRECTOR);
//    }
//
//    @Override
//    public void puedeSerAgregadoPorMandoMedio(MandoMedio jefe) {
//        this.cargo.puedeSerAgregadoPor(jefe);
//    }
}
