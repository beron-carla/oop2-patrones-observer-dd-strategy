package observer;

public class ConsolaTemp implements Observer {

    public static final String AIRE_ACONDICIONADO = "Hace calor, se encenderá el aire acondicionado";
    public static final String CALDERA = "Hace frío, se encenderá la caldera";
    private final float TOPE_MIN = 12;
    private final float TOPE_MAX = 17;

    private void mostrarPorConsola(String temperatura) {
        var tempFloat = Float.parseFloat(temperatura);
        esMenor(tempFloat);
        esMayor(tempFloat);
    }

    private void esMayor(float tempFloat) {
        if (tempFloat > TOPE_MAX) {
            System.out.println(AIRE_ACONDICIONADO);
        }
    }

    private void esMenor(float temperatura) {
        if (temperatura < TOPE_MIN) {
            System.out.println(CALDERA);
        }
    }


    @Override
    public void update(String data) {
        mostrarPorConsola(data);
    }
}
