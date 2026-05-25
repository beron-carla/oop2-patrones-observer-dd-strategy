package strategy;

import java.util.HashMap;
import java.util.Map;

enum EmpresasEnvios {
    ARGENTINO,
    COLECTIVOS_SUR
}

public class SistemaEnvios {
    //    private EmpresasEnvios empresaDeEnvio;
    private Map<String, CalculadorEnvio> estrategiasCalculo = new HashMap<>();

    //    private String destino;
//    private float pesoEnvio;
//
    public SistemaEnvios() {
//        this.empresaDeEnvio = empresaEnvio;
//        this.destino = destino;
//        this.pesoEnvio = pesoEnvio;
        this.estrategiasCalculo.put(EmpresasEnvios.ARGENTINO.name(), new CalculadorEnviosArgentino());
        this.estrategiasCalculo.put(EmpresasEnvios.COLECTIVOS_SUR.name(), new CalculadorEnviosColectivosSur());
    }

    public float calcularCostoEnvio(EmpresasEnvios empresaEnvio, String destino, Carrito carritoDeCompras) {
        assertTipoEnvioValido(empresaEnvio);
        return carritoDeCompras.calcularTotalProductos() + this.estrategiasCalculo.get(empresaEnvio.name()).costoEnvio(destino, carritoDeCompras.calcularPesoTotal());
    }

    public void assertTipoEnvioValido(EmpresasEnvios empresaEnvio) {
        if (!this.estrategiasCalculo.containsKey(empresaEnvio.name())) {
            throw new RuntimeException("Tipo de envio inexistente");
        }
    }
}
