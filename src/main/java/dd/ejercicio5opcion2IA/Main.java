package dd.ejercicio5opcion2IA;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        var gestor = new GestorDePrestamosMultimedia();
        var persona = new Persona("Juan", "Perez", "12345678");

        var libro = new Articulo(new Libro(), "El Quijote", 1605, new Usado(), 450);
        var disco = new Articulo(new Disco(), "Led Zeppelin", 1968, new Deteriorado());
        var revista = new Articulo(new Revista(), "National Geographic", 2024,
                new Nuevo(), LocalDate.of(2024, 1, 1), 150);
        gestor.generarPrestamo(persona, libro);
        gestor.generarPrestamo(persona, revista);
        // gestor.generarPrestamo(persona, disco);
        // RuntimeException — deteriorado y < 1980
    }
}
