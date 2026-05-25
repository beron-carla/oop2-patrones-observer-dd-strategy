package strategy.ejercicio2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var fechaDeNacimiento = new FechaDeNacimientoCorta(LocalDate.now());
        var unaPersona = new Persona("pedro", "muñoz", fechaDeNacimiento);
    }
}
