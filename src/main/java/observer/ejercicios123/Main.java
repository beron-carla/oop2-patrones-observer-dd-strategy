package observer.ejercicios123;

import java.io.File;

public class Main {
    public static void main(String[] args) {

//        var observers = List.of(new ConsolaTemp(), new RegistroTemperatura(new File("temp.txt")));
//        ClimaOnline servicio = new WeatherChannelService();
//        Medidor medidor = new Medidor(observers, servicio);
//        medidor.leerTemperatura();

        //Usando decoradores !
        ClimaOnline servicio = new WeatherChannelService();
        var observers = new RegistroTemperatura(new File("temp.txt"), new ConsolaTemp());
        var medidor = new Medidor(observers, servicio);
        medidor.leerTemperatura();


    }
}
