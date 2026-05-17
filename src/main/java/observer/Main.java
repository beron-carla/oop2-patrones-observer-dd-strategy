package observer;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var observers = List.of(new ConsolaTemp(), new RegistroTemperatura(new File("temp.txt")));
        ClimaOnline servicio = new WeatherChannelService();
        Medidor medidor = new Medidor(observers, servicio);
        medidor.leerTemperatura();

    }
}
