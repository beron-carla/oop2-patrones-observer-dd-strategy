package strategy.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FechaDeNacimientoLarga implements FechaDeNacimiento {
    private static final DateTimeFormatter FORMATO_LARGO =
            DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", new Locale("es", "AR"));
    private LocalDate fecha;

    public FechaDeNacimientoLarga(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String fechaDeNacimiento() {
        return this.fecha.format(FORMATO_LARGO);
    }
}
