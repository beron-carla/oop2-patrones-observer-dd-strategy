package strategy.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaDeNacimientoCorta implements FechaDeNacimiento {

    private static final DateTimeFormatter FORMATO_CORTO =
            DateTimeFormatter.ofPattern("d-MM-yyyy");
    LocalDate fecha;


    public FechaDeNacimientoCorta(LocalDate fecha) {
        this.fecha = fecha;

    }

    @Override
    public String fechaDeNacimiento() {
        return this.fecha.format(FORMATO_CORTO);
    }
}
