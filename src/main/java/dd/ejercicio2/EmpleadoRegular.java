package dd.ejercicio2;

public class EmpleadoRegular extends Empleado {
    public static final String VALIDA_DIRECTOR = "Como director solo mandos medios pueden estar a mi cargo";
    private final String nombre;
    private float salario;
    private Cargo cargo;

    public EmpleadoRegular(String nombre, float salario, Cargo Cargo) {
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
    public void puedeSerAgregadoPorDirector(Director jefe) {
        throw new RuntimeException(VALIDA_DIRECTOR);
    }

    @Override
    public void puedeSerAgregadoPorMandoMedio(MandoMedio jefe) {
        this.cargo.puedeSerAgregadoPorMandoMedio(jefe);
    }
}
