package dd.ejercicio5;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGestorDePrestamos {

    @Test
    public void TestGeneracionDeFechaDeDevolucionRevista() {
        var gestorDePrestamos = new GestorDePrestamosMultimedia();

        var libro = new Articulo(new Revista(), "forbes", 2000, Estado.NUEVO, LocalDate.now(), 20);

        var persona = new Persona("jose", "perez", "38548234");

        gestorDePrestamos.generarPrestamo(persona, libro);

        Optional<Prestamo> prestamo = gestorDePrestamos.buscarPrestamo(0);
        Prestamo p = null;

        if (prestamo.isPresent()) {
            p = prestamo.get();

        }

        LocalDate expected = LocalDate.of(2026, 5, 24);
        assertEquals(expected, p.fechaDevolucion());


    }
}
