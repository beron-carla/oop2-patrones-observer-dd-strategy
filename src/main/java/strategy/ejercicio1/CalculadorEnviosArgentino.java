package strategy.ejercicio1;


public class CalculadorEnviosArgentino implements CalculadorEnvio {


    public static final int MONTO_FIJO_CAPITAL_FEDERAL = 500;

    public static final int MONTO_FIJO_OTRO_DESTINO = 800;
    private float total;
    private GeneradorDeDistancias calculadorDeKm;

    CalculadorEnviosArgentino(GeneradorDeDistancias calculadorDistancia) {
        this.total = 0;
        this.calculadorDeKm = calculadorDistancia;
    }

    @Override
    public float costoEnvio(Destino destino, float pesoTotal) {
        this.total = sumarMontoFijoCapitalFederal(destino);
        this.total = sumarMontoFijoDestino(destino);
        return this.total;
    }

    private float sumarMontoFijoDestino(Destino destino) {
        esOtroDestino(destino);
        return this.total;
    }

    private void esOtroDestino(Destino destino) {
        if (!destino.esCapitalFederal() && !destino.esGranBuenosAires()) {
            int distancia = calculadorDeKm.calcularDistancia(destino);
            this.total += MONTO_FIJO_OTRO_DESTINO + sumarMontoPorDistancia(distancia);
        }

    }

    private float sumarMontoPorDistancia(int km) {
        return this.total + (km * 5);
    }


    private float sumarMontoFijoCapitalFederal(Destino destino) {
        if (destino.esCapitalFederal()) {
            this.total += MONTO_FIJO_CAPITAL_FEDERAL;
        }
        return this.total;


    }

}
