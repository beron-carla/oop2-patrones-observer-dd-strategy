package observer.ejercicios123;

public class Medidor extends Observado {
    private String temperatura;
    private ClimaOnline clima;

    public Medidor(Observer observers, ClimaOnline clima) {
        super(observers);
        this.clima = clima;
    }

    public String leerTemperatura() {
//leo la temperatura del servicio web
        this.temperatura = this.clima.temperatura();
        //notifica a los observadores
        this.notificar(this.temperatura);
        return this.temperatura;
    }
}

