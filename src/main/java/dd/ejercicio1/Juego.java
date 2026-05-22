package dd.ejercicio1;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    // Opciones posibles
    private ElementoDeJuego[] opciones = {new Piedra(), new Papel(), new Tijera()};
    private Map<String, ElementoDeJuego> stringToElementoJuego;
    // Crear un objeto Scanner para leer la entrada del usuario
    private Scanner scanner = new Scanner(System.in);

    public Juego() {
        this.stringToElementoJuego = Map.of("piedra", new Piedra(), "papel", new Papel(), "tijera", new Tijera());
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            ElementoDeJuego eleccionUsuario = elegirElementoUsuario(scanner);
            ElementoDeJuego eleccionComputadora = elegirElementoComputadora(this.stringToElementoJuego.keySet().toArray(new String[0]));

            // Mostrar las elecciones de ambos jugadores
            System.out.println("Tu elección: " + eleccionUsuario);
            System.out.println("Elección de la computadora: " + eleccionComputadora);

            // Mostrar el resultado
            System.out.println(new Jugada().jugar(eleccionUsuario, eleccionComputadora));

            continuar = preguntarSiQueremosContinuar();
        }// end while

        System.out.println("¡Hasta pronto!");
        scanner.close();
    }

    private ElementoDeJuego elegirElementoUsuario(Scanner scanner) {
        // Solicitar al usuario que ingrese su elección
        System.out.println("Elige una opción: piedra, papel o tijera");
        String eleccion = scanner.nextLine().toLowerCase();
        return this.stringToElementoJuego.get(eleccion);
    }

    private ElementoDeJuego elegirElementoComputadora(String[] opciones) {
        // Crear un objeto Random para generar la elección de la computadora
        Random random = new Random();
        // Generar la elección de la computadora
        int indice = random.nextInt(3);
        return this.stringToElementoJuego.get(opciones[indice]);
    }

    private boolean preguntarSiQueremosContinuar() {
        System.out.println("¿Desea continuar? s/n");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        return respuesta.toLowerCase().charAt(0) == 's';
    }
}
