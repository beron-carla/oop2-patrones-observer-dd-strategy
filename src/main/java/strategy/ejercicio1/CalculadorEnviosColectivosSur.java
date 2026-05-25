package strategy;

public class CalculadorEnviosColectivosSur implements CalculadorEnvio {

    public static final int MONTO_FIJO_CAPITAL_FEDERAL = 1000;
    public static final int MONTO_FIJO_GRAN_BUENOS_AIRES = 1500;
    public static final int ADICIONAL_POR_PESO_MAX = 2000;
    public static final int ADICIONAL_POR_PESO_MIN = 500;
    private float total;

    CalculadorEnviosColectivosSur() {
        this.total = 0;
    }

    @Override
    public float costoEnvio(String destino, float pesoTotal) {
        this.total = sumarMontoFijoCapitalFederal(destino);
        this.total = sumarMontoFijoGranBuenosAires(destino);
        this.total = sumarAdicionalPorPeso(pesoTotal);
        return this.total;
    }

    public float total() {
        return this.total;
    }

    private float sumarAdicionalPorPeso(float pesoTotal) {
        adicionalPorPesoMinimo(pesoTotal);
        adicionalPorPesoMaximo(pesoTotal);
        return this.total;
    }

    private void adicionalPorPesoMaximo(float pesoTotal) {
        if (pesoTotal > 30) {
            this.total = this.total + ADICIONAL_POR_PESO_MAX;
        }
    }

    private void adicionalPorPesoMinimo(float pesoTotal) {
        if (pesoTotal > 5 && pesoTotal < 30) {
            this.total = this.total + ADICIONAL_POR_PESO_MIN;
        }
    }


    private float sumarMontoFijoGranBuenosAires(String destino) {
        if (destino == Destinos.GRAN_BUENOS_AIRES.name()) {
            this.total = this.total + MONTO_FIJO_GRAN_BUENOS_AIRES;
        }
        return this.total;
    }

    private float sumarMontoFijoCapitalFederal(String destino) {
        if (destino == Destinos.CAPITAL_FEDERAL.name()) {
            this.total = this.total + MONTO_FIJO_CAPITAL_FEDERAL;
        }
        return this.total;


    }

    enum Destinos {
        CAPITAL_FEDERAL,
        GRAN_BUENOS_AIRES,
        OTRO_DESTINO
    }
}
