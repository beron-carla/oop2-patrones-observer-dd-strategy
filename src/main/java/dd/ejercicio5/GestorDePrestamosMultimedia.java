package dd.ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestorDePrestamosMultimedia {
    private List<Prestamo> prestamos;

    public GestorDePrestamosMultimedia() {
        prestamos = new ArrayList<>();
    }


    public void generarPrestamo(Persona persona, Articulo articulo) {
        int dias = articulo.calcularDuracionPrestamo();
        LocalDate fechaDevolucion = LocalDate.now().plusDays(dias);
        prestamos.add(new Prestamo(persona, articulo, LocalDate.now(), fechaDevolucion));
    }

    public Optional<Prestamo> buscarPrestamo(int id) {
        return prestamos.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
    }

}
