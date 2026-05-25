package strategy.ejercicio1;

public class CalculadorEnviosColectivosSur implements CalculadorEnvio {

    public static final int MONTO_FIJO_CAPITAL_FEDERAL = 1000;
    public static final int MONTO_FIJO_GRAN_BUENOS_AIRES = 1500;
    public static final int ADICIONAL_POR_PESO_MAX = 2000;
    public static final int ADICIONAL_POR_PESO_MIN = 500;
    public static final int MIN = 5;
    public static final int MAX = 30;
    public static final int MONTO_FIJO_OTRO_DESTINO = 3000;
    private float total;

    CalculadorEnviosColectivosSur() {
        this.total = 0;
    }

    @Override
    public float costoEnvio(Destino destino, float pesoTotal) {
        sumarMontoFijoCapitalFederal(destino);
        sumarMontoFijoGranBuenosAires(destino);
        sumarMontoFijoDestino(destino);
        sumarAdicionalPorPeso(pesoTotal);
        return this.total;
    }

    private void sumarMontoFijoDestino(Destino destino) {
        if (!destino.esCapitalFederal() && !destino.esGranBuenosAires()) {
            this.total += MONTO_FIJO_OTRO_DESTINO;
        }
    }

    private float sumarAdicionalPorPeso(float pesoTotal) {
        sumarAdicionalPorPesoMinimo(pesoTotal);
        sumarAdicionalPorPesoMaximo(pesoTotal);
        return this.total;
    }

    private void sumarAdicionalPorPesoMaximo(float pesoTotal) {
        if (pesoTotal > 30) {
            this.total += ADICIONAL_POR_PESO_MAX;
        }
    }

    private void sumarAdicionalPorPesoMinimo(float pesoTotal) {
        if (pesoTotal > MIN && pesoTotal < MAX) {
            this.total += ADICIONAL_POR_PESO_MIN;
        }
    }


    private void sumarMontoFijoGranBuenosAires(Destino destino) {
        if (destino.esGranBuenosAires()) {
            this.total += MONTO_FIJO_GRAN_BUENOS_AIRES;
        }
    }

    private void sumarMontoFijoCapitalFederal(Destino destino) {
        if (destino.esCapitalFederal()) {
            this.total += MONTO_FIJO_CAPITAL_FEDERAL;
        }


    }

}
