package dd.ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    @Test
    public void calculoSalarial() {
        var director = new EmpleadoJerarquico("director", 1500, new Director());
        var mandoMedio = new EmpleadoJerarquico("mandoMedio", 500, new MandoMedio());
        var empleadoRegular = new EmpleadoRegular("empleadoRegular", 100, new Junior());
        director.agregarEmpleado(mandoMedio);
        mandoMedio.agregarEmpleado(empleadoRegular);
        var laserX = new LaserX(director);
        assertEquals(2100, laserX.masaSalarial());
    }


    @Test
    public void directorNoPuedeSerJefeDeJunior() {
        var director = new EmpleadoJerarquico("director1", 1000, new Director());
        var empleadoRegular = new EmpleadoRegular("empleadoRegular", 100, new Junior());

        var e = assertThrows(RuntimeException.class, () -> {
            director.agregarEmpleado(empleadoRegular);
        });

        assertEquals("Un Director no puede tener a cargo a un Junior", e.getMessage());
    }

    //
    @Test
    public void mandoMedioNoPuedeSerJefeDeDirector() {
        var director = new EmpleadoJerarquico("director1", 1000, new Director());
        var mandoMedio = new EmpleadoJerarquico("mandoMedio", 500, new MandoMedio());
        var e = assertThrows(RuntimeException.class, () -> {
            mandoMedio.agregarEmpleado(director);
        });

        assertEquals("Un Mando Medio no puede tener a cargo a un Director", e.getMessage());
    }

    @Test
    public void directorPuedeSerJefeDeMandoMedio() {
        var director = new EmpleadoJerarquico("director1", 1000, new Director());
        var mandoMedio = new EmpleadoJerarquico("mandoMedio", 500, new MandoMedio());
        director.agregarEmpleado(mandoMedio);
        assertTrue(director.tieneDeEmpLeadoA(mandoMedio));
    }

    @Test
    public void mandoMedioPuedeSerJefeDeJunior() {
        var mandoMedio = new EmpleadoJerarquico("mandoMedio", 500, new MandoMedio());
        var empleadoRegular = new EmpleadoRegular("empleadoRegular", 100, new Junior());
        mandoMedio.agregarEmpleado(empleadoRegular);
        assertTrue(mandoMedio.tieneDeEmpLeadoA(empleadoRegular));
    }
}
