package dd.ejercicio5opcion2IA;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestorDePrestamosMultimedia {
    private List<Prestamo> prestamos;

    public GestorDePrestamosMultimedia() {
        prestamos = new ArrayList<>();
    }

    private LocalDate calcularFechaDevolucion(Articulo articulo) {
        var cantDias = articulo.calcularDuracionPrestamo();
        return LocalDate.now().plusDays(cantDias);
    }

    public void generarPrestamo(Persona persona, Articulo articulo) {
        LocalDate fechaDevolucion = calcularFechaDevolucion(articulo);
        var prestamo = new Prestamo(persona, articulo, LocalDate.now(), fechaDevolucion);
        prestamos.add(prestamo);
    }

    public Optional<Prestamo> buscarPrestamo(int id_prestamo) {
        return prestamos.stream()
                .filter(p -> p.getId() == id_prestamo)
                .findFirst();
    }
}