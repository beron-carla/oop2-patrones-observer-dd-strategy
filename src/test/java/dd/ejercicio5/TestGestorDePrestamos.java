package dd.ejercicio5;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGestorDePrestamos {

    @Test
    public void TestGeneracionDeFechaDeDevolucionRevista() {
        var gestorDePrestamos = new GestorDePrestamosMultimedia();

        var revista = new Revista("wired", new Nuevo(), 20, LocalDate.now());
        var persona = new Persona("jose", "perez", "38548234");

        gestorDePrestamos.generarPrestamo(persona, revista);

        Optional<Prestamo> prestamo = gestorDePrestamos.buscarPrestamo(0);
        Prestamo p = null;

        if (prestamo.isPresent()) {
            p = prestamo.get();

        }

        LocalDate expected = LocalDate.of(2026, 5, 28);

        assertEquals(expected, p.fechaDevolucion());


    }
}
