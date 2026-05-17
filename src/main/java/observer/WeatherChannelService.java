package observer;

// Estas tres importaciones son de la librería estándar de Java (desde Java 11)
// No necesitan dependencias externas, vienen incluidas con el JDK

import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherChannelService implements ClimaOnline {

    // La URL completa de la API. Es una constante (static final = no cambia nunca).
    // Contiene las coordenadas de Viedma y le pedimos el clima actual.
    // Podés pegar esta URL en el navegador y ver el JSON que devuelve.
    private static final String URL =
            "https://api.open-meteo.com/v1/forecast" + // endpoint base de la API
                    "?latitude=-40.81" +                       // latitud de Viedma
                    "&longitude=-62.99" +                       // longitud de Viedma
                    "&current_weather=true";                    // que incluya clima actual

    @Override
    public String temperatura() {

        // try/catch porque todo lo que involucra red puede fallar:
        // sin internet, servidor caído, timeout, etc.
        try {

            // HttpClient es el objeto que va a realizar la petición HTTP.
            // Es como abrir un navegador web, pero desde código.
            // .newHttpClient() crea una instancia con configuración por defecto.
            HttpClient client = HttpClient.newHttpClient();

            // HttpRequest es el "sobre" que contiene todo lo que queremos pedir.
            // Usamos un Builder (patrón de diseño) para armarlo paso a paso:
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL)) // a qué dirección va la petición
                    // URI.create() convierte el String en un objeto URI
                    .GET()                // método HTTP: GET significa "quiero obtener datos"
                    // (existen también POST, PUT, DELETE, etc.)
                    .build();             // construye el objeto final (cierra el Builder)

            // Acá se realiza la petición real. El programa se detiene aquí
            // hasta que el servidor responda (llamada bloqueante).
            // - client.send() envía el request al servidor
            // - HttpResponse.BodyHandlers.ofString() le dice cómo leer
            //   la respuesta: como texto plano (String)
            // El genérico <String> indica que el cuerpo de la respuesta es un String
            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            // El servidor siempre devuelve un código de estado HTTP:
            // 200 = OK (todo bien)
            // 404 = no encontrado
            // 500 = error interno del servidor
            // Si no es 200, algo salió mal y lanzamos una excepción con el código
            if (response.statusCode() != 200) {
                throw new RuntimeException(
                        "Error HTTP: " + response.statusCode()
                );
            }

            // response.body() devuelve el cuerpo de la respuesta como String.
            // Se ve así (podés verlo pegando la URL en el navegador):
            // {
            //   "current_weather": {
            //     "temperature": 18.3,
            //     "windspeed": 12.4,
            //     "weathercode": 0,
            //     "time": "2026-05-17T14:00"
            //   }
            // }
            // new JSONObject(...) convierte ese String en un objeto navegable
            JSONObject json = new JSONObject(response.body());

            // Navegamos el JSON capa por capa:
            // .getJSONObject("current_weather") → entra al objeto "current_weather"
            // .getDouble("temperature")         → obtiene el valor numérico "temperature"
            // Resultado: 18.3 (un double)
            double temp = json.getJSONObject("current_weather")
                    .getDouble("temperature");

            // Devolvemos el número como texto, por ejemplo: "18.3 °C"
            // Es lo que exige la interfaz ClimaOnline: devolver un String
            return String.valueOf(temp);

        } catch (Exception e) {
            // Si algo falló (red, parseo, etc.), envolvemos el error original
            // en una RuntimeException para que se propague hacia arriba.
            // e.getMessage() trae el mensaje del error original.
            // El segundo parámetro "e" conserva la causa original (para el stack trace).
            throw new RuntimeException(
                    "No se pudo obtener la temperatura: " + e.getMessage(), e
            );
        }
    }
}