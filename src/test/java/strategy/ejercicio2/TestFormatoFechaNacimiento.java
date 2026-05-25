package strategy.ejercicio2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFormatoFechaNacimiento {

    private Persona persona;


    @DisplayName("Testea formato corto")
    @Test
    void testFechaCorta() {
        var fechaFormatoCorto = new FechaDeNacimientoCorta(LocalDate.of(1999, 10, 11));
        persona = new Persona("perez", "alejandra", fechaFormatoCorto);
        assertEquals("11-10-1999", persona.fechaDeNacimiento());

    }

    @DisplayName("Testea formato largo")
    @Test
    public void testFechaLarga() {
        var fechaFormatoLargo = new FechaDeNacimientoLarga(LocalDate.of(1999, 10, 11));
        persona = new Persona("perez", "alejandra", fechaFormatoLargo);
        assertEquals("11 de octubre de 1999", persona.fechaDeNacimiento());

    }
}
