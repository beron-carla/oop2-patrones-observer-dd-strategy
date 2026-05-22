package dd.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoJerarquico extends Empleado {
    public static final String VALIDA_DIRECTOR = "Como director solo mandos medios pueden estar a mi cargo";
    public static final String VALIDA_MANDOMEDIO = "Como mando medio solo juniors pueden estar a mi cargo";
    public static final String VALIDA_EMPLADO_JERARQUICO = "Solo directores o mandos medios son empleados jerarquicos";
    private final String nombre;
    private List<Empleado> empleados;
    private float salario;
    private Cargo cargo;

    public EmpleadoJerarquico(String nombre, float salario, Cargo cargo) {
//        if (!cargo.equals(Cargo.DIRECTOR) || !cargo.equals(Cargo.MANDOMEDIO)) {
//            throw new RuntimeException(VALIDA_EMPLADO_JERARQUICO);
//        }
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
//        if (cargo.equals(Cargo.DIRECTOR) && !empleado.cargo().equals(Cargo.MANDOMEDIO)) {
//            throw new RuntimeException(VALIDA_DIRECTOR);
//        }
//        if (cargo.equals(Cargo.MANDOMEDIO) && !empleado.cargo().equals(Cargo.JUNIOR)) {
//            throw new RuntimeException(VALIDA_MANDOMEDIO);
//        }
        this.cargo.validarSubordinado(empleado);
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
    public void puedeSerAgregadoPorDirector(Director jefe) {
        this.cargo.puedeSerAgregadoPorDirector(jefe);
    }

    @Override
    public void puedeSerAgregadoPorMandoMedio(MandoMedio jefe) {
        this.cargo.puedeSerAgregadoPorMandoMedio(jefe);
    }

    public boolean tieneDeEmpeadoA(Empleado mandoMedio) {
        for (Empleado e : empleados) {
            if (e == mandoMedio) return true;
        }
        return false;
    }

    //Delega en el cargo - el cargo sabe si puede ser subordinado
    //this es EmpleadoJerarquico pero su cargo exactamente sabe qué es

}
