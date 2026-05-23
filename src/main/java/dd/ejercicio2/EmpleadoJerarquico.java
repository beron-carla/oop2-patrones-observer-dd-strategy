package dd.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmpleadoJerarquico extends Empleado {
    public static final String VALIDA_DIRECTOR = "Como director solo mandos medios pueden estar a mi cargo";
    public static final String VALIDA_MANDOMEDIO = "Como mando medio solo juniors pueden estar a mi cargo";
    public static final String VALIDA_EMPLADO_JERARQUICO = "Solo directores o mandos medios son empleados jerarquicos";
    private static int contadorId = 0;
    private final String nombre;
    private int id;
    private List<Empleado> empleados;
    private float salario;
    private Cargo cargo;

    public EmpleadoJerarquico(String nombre, float salario, Cargo cargo) {
//        if (!cargo.equals(Cargo.DIRECTOR) || !cargo.equals(Cargo.MANDOMEDIO)) {
//            throw new RuntimeException(VALIDA_EMPLADO_JERARQUICO);
//        }
        if (isNull(cargo)) {
            throw new RuntimeException("Cargo debe ser distinto de null");
        }
        this.id = ++contadorId;
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
        this.empleados = new ArrayList<>();
    }

    private boolean isNull(Cargo cargo) {
        return cargo == null ? true : false;
    }

    public void agregarEmpleado(Empleado empleado) {

//        this.cargo.validarSubordinado(empleado);
        if (!this.cargo.agregarA(empleado)) {
            throw new RuntimeException("Un " + this.cargo.toString() + " no puede tener a cargo a un " + empleado.toString());
        }
        this.empleados.add(empleado);
    }

    @Override
    public float calcularSalario() {
        float total = this.salario;
        for (Empleado m : empleados) {
            total += m.calcularSalario();
        }
        return total;
    }

    @Override
    public Cargo cargo() {
        return this.cargo;
    }

    @Override
    public String toString() {
        return this.cargo.toString();
    }


//    @Override
//    public void puedeSerAgregadoPorDirector(Director jefe) {
//        this.cargo.puedeSerAgregadoPor(jefe);
//    }
//
//    @Override
//    public void puedeSerAgregadoPorMandoMedio(MandoMedio jefe) {
//        this.cargo.puedeSerAgregadoPor(jefe);
//    }

    @Override
    public boolean puedeSerAgregadoPor(Director jefe) {
        return this.cargo.puedeSerAgregadoPor(jefe);
    }

    @Override
    public boolean puedeSerAgregadoPor(MandoMedio jefe) {
        return this.cargo.puedeSerAgregadoPor(jefe);
    }

    public boolean tieneDeEmpLeadoA(Empleado mandoMedio) {
        return this.empleados.contains(mandoMedio);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoJerarquico that = (EmpleadoJerarquico) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //Delega en el cargo - el cargo sabe si puede ser subordinado
    //this es EmpleadoJerarquico pero su cargo exactamente sabe qué es

}
