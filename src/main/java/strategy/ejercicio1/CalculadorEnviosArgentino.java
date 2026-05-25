package strategy;


public class CalculadorEnviosArgentino implements CalculadorEnvio {

    @Override
    public float costoEnvio(String destino, float pesoTotal) {
        return 0;
    }
}
