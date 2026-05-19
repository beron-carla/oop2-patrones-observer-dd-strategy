package observer.ejercicios123;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;

public class RegistroTemperatura extends ObserverDecorator {

    public static final String ERROR_AL_EXPORTAR = "Error al exportar";
    private File file;

    public RegistroTemperatura(File file, Observer observer) {
        super(observer);
        this.file = file;
    }


    private void write(String temp) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.file))) {
            writer.write(temp + " °C" + " - " + LocalDate.now());
        } catch (Exception e) {
            throw new RuntimeException(ERROR_AL_EXPORTAR);
        }
    }

    @Override
    public void update(String data) {
        this.write(data);
        super.update(data);
    }
}
